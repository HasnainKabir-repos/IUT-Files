--1

CREATE OR REPLACE PROCEDURE FIND_TIME(TITLE IN VARCHAR2)
IS 
    time MOVIE.MOV_TIME%TYPE;
    total_time MOVIE.MOV_TIME%TYPE;
BEGIN
    SELECT MOV_TIME INTO TIME FROM MOVIE WHERE MOV_TITLE = TITLE;
    total_time := TIME + trunc(TIME/70) * 15;

    IF (MOD(TIME, 70) < 30) THEN

        total_time := total_time - 15;

    END IF;

    DBMS_OUTPUT.PUT_LINE(TRUNC(total_time/60)|| ' hrs and '|| TRUNC(MOD(total_time, 60))|| ' minutes ');
END;
/

set serveroutput on;
begin
    FIND_TIME('Blade Runner');
end;
/

--2
CREATE OR REPLACE PROCEDURE FIND_TOP_RATED(N IN NUMBER)
IS
begin
    FOR I IN 
    (SELECT * FROM (SELECT MOV_TITLE, AVG(REV_STARS) AS REV 
    FROM MOVIE NATURAL JOIN RATING
    GROUP BY MOV_TITLE ORDER BY REV DESC) WHERE ROWNUM<=N) LOOP
        DBMS_OUTPUT.PUT_LINE(I.MOV_TITLE || ' ' || I.REV);
    END loop;
end;
/

set serveroutput on;

begin
    FIND_TOP_RATED(10);
end;
/

--3
CREATE OR REPLACE FUNCTION YEARLY_EARNING(TITLE VARCHAR2)
RETURN NUMBER
IS 
    EARNING NUMBER; 
    YEARS NUMBER(8,2);
    RELEASE_DATE MOVIE.MOV_RELEASEDATE%TYPE;
    YEARLY_EARNING NUMBER(8,2);
BEGIN 
    FOR I IN
    (SELECT RATING.REV_STARS, MOVIE.MOV_RELEASEDATE
    FROM MOVIE NATURAL JOIN RATING WHERE MOV_TITLE = TITLE)
    LOOP 
        IF(I.REV_STARS >= 6) THEN
            EARNING:= EARNING+10;
        END IF;
    RELEASE_DATE:= I.MOV_RELEASEDATE;
    END LOOP;
    SELECT MONTHS_BETWEEN(SYSDATE, RELEASE_DATE) / 12 INTO YEARS FROM DUAL;
    YEARLY_EARNING := EARNING / YEARS; 
RETURN YEARLY_EARNING;
END;
/

set serveroutput on;

begin
    DBMS_OUTPUT.PUT_LINE(YEARLY_EARNING('Blade Runner'));
end;
/

--4

CREATE OR REPLACE FUNCTION GENRE_STATUS(GENID GENRES.GEN_ID%TYPE) 
RETURN VARCHAR2 AS
    T_AVG_RATING FLOAT;
    T_REV_COUNT NUMBER;
    REVIEW_COUNT NUMBER;
    AVG_RATING FLOAT;

BEGIN 
    SELECT COUNT(*), AVG(RATING.REV_STARS) INTO T_REV_COUNT, T_AVG_RATING
    FROM GENRES, MTYPE, RATING
    WHERE GENRES.GEN_ID = MTYPE.GEN_ID AND MTYPE.MOV_ID = RATING.MOV_ID;
    SELECT COUNT(*), AVG(RATING.REV_STARS) INTO REVIEW_COUNT, AVG_RATING
    FROM GENRES, MTYPE, RATING
    WHERE GENRES.GEN_ID = MTYPE.GEN_ID AND MTYPE.MOV_ID = RATING.MOV_ID AND GENRES.GEN_ID = GENID;
    
    IF (REVIEW_COUNT > T_REV_COUNT AND AVG_RATING < T_AVG_RATING) THEN
        RETURN 'WIDELY WATCHED';
    ELSIF(REVIEW_COUNT < T_REV_COUNT AND AVG_RATING > T_AVG_RATING) THEN
        RETURN 'HIGHLY RATED';
    ELSIF(REVIEW_COUNT > T_REV_COUNT AND AVG_RATING > T_AVG_RATING) THEN
        RETURN 'PEOPLES FAVOURITE';
    ELSE 
        RETURN 'SO SO';
    END IF;
END;
/
begin
  DBMS_OUTPUT.PUT_LINE(GENRE_STATUS(903))
end;
/

--5

CREATE OR REPLACE TYPE MOVIE_TYPE AS OBJECT(
    GEN_TITLE VARCHAR2(100),
    NUM NUMBER
);
/

CREATE OR REPLACE TYPE MOVIE_TABLE AS TABLE OF MOVIE_TYPE;
/

CREATE OR REPLACE FUNCTION FREQUENT_GENRE(DATE1 DATE, DATE2 DATE)
RETURN MOVIE_TABLE
IS 
    M MOVIE_TABLE;
BEGIN 
    SELECT MOVIE_TYPE(GEN_TITLE, NUM) BULK COLLECT INTO M FROM(
        SELECT GEN_TITLE, count(MOV_ID) AS NUM FROM
        GENRES NATURAL JOIN MTYPE WHERE MOV_ID IN(
            SELECT MOV_ID FROM MOVIE WHERE MOVIE.MOV_RELEASEDATE BETWEEN DATE1 AND DATE2
        )GROUP BY GEN_TITLE ORDER BY NUM DESC
    ) WHERE ROWNUM<=1;
    
RETURN M;
END;
/


'28-JUN-2012'