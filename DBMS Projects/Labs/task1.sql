SET SERVEROUPUT ON
BEGIN
DBMS_OUTPUT . PUT_LINE ( ' HASNAIN KABIR ');
END;
/

DECLARE
    STUDENTID NUMBER(9);
BEGIN 
    STUDENTID := '&studentid';
    DBMS_OUTPUT.PUT_LINE(STUDENTID);
END;
/

DECLARE
    NUM1 NUMBER(4);
    NUM2 NUMBER(4);
BEGIN 
    NUM1 := &num1;
    NUM2 := &num2;
    DBMS_OUTPUT.PUT_LINE(NUM1 * NUM2);
END;
/

DECLARE
    CURRENT DATE := SYSDATE;
BEGIN
    DBMS_OUTPUT.PUT_LINE(TO_CHAR(CURRENT, 'HH12:MI:SS'));
END;
/

DECLARE 
    NUM NUMERIC(5,2);

BEGIN
    NUM := &NUM;
    CASE NUM - TRUNC(NUM)
        WHEN 0 THEN
            DBMS_OUTPUT.PUT_LINE('WHOLE NUMBER');
        ELSE
            DBMS_OUTPUT.PUT_LINE('FRACTION');
    END CASE;
END;
/

DECLARE 
    NUM NUMERIC(5,2);

BEGIN
    NUM := &NUM;
        IF (NUM-TRUNC(NUM) = 0) THEN
            DBMS_OUTPUT.PUT_LINE('WHOLE NUMBER');
        ELSE
            DBMS_OUTPUT.PUT_LINE('FRACTION');
    END IF;
END;
/

CREATE OR REPLACE PROCEDURE FIND_COMPOSITE(NUM IN NUMBER, RESULT OUT VARCHAR2)
AS 
I NUMBER;
TEMP NUMBER;
BEGIN
    I := 2;
    TEMP := 1;

    FOR I IN 2..NUM/2 
    LOOP
        IF(MOD(NUM, I) = 0) THEN 
            TEMP :=0;
            EXIT;
        END IF;
    END LOOP;

    IF TEMP = 1
    THEN 
        RESULT := 'PRIME';
    ELSE
        RESULT := 'COMPOSITE';
    END IF;
END;
/

DECLARE 
    NUM NUMBER(3);
    RESULT VARCHAR2(10);
BEGIN
    NUM:=&NUM;
    FIND_COMPOSITE(NUM, RESULT);
    DBMS_OUTPUT.PUT_LINE(RESULT);
END;
/