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
CREATE OR REPLACE FUNCTION YEARLY_EARNING(TITLE MOVIE%MOV_TITLE)
RETURN NUMBER
IS 
    EARNING NUMBER; 
    RELEASE_DATE MOVIE.MOV_RELEASEDATE%TYPE;
    YEARLY_EARNING NUMBER(8,2);
    MONTH_DIFF NUMBER;
BEGIN 
    FOR I IN
    (SELECT REV_STARS, MOV_RELEASEDATE INTO RELEASE_DATE
    FROM MOVIE NATURAL JOIN RATING WHERE MOV_TITLE = TITLE)
    LOOP 
        IF(I.REV_STARS >= 6) THEN
            EARNING:= EARNING+10;
        END IF;
    END LOOP;
    SELECT MONTHS_BETWEEN(SYSDATE, RELEASE_DATE)  INTO MONTH_DIFF FROM DUAL;
    YEARLY_EARNING := EARNING/TRUNC(MONTH_DIFF/12);
RETURN YEARLY_EARNING;
END;
/

begin
    DBMS_OUTPUT.PUT_LINE(YEARLY_EARNING('Blade Runner'));
end;
/