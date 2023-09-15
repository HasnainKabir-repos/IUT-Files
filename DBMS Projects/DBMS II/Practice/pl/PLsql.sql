--15.11
DROP TABLE CITIZEN;
DROP TABLE SALARY;
DROP TABLE AIRPORTSLOG;
CREATE TABLE CITIZEN(
    ID INT,
    NAME VARCHAR2(20),
    DOB DATE
);

CREATE TABLE SALARY(
    CID INT,
    DT DATE,
    AMOUNT NUMBER
);


CREATE TABLE AIRPORTSLOG(
    NAME VARCHAR2(20),
    DT DATE,
    TP VARCHAR2(13) CONSTRAINT AIR_TYPE CHECK (TP IN('DEPARTURE', 'ARRIVAL')),
    PNAME VARCHAR2(25)
);

CREATE OR REPLACE FUNCTION STATUS_EVALUATION(ID INT)
RETURN VARCHAR2
AS
    SAL NUMBER;
    DEP NUMBER;
    DOMAIN VARCHAR2(20);
BEGIN

    SELECT AVG(AMOUNT) INTO SAL FROM SALARY WHERE 
    DT BETWEEN SYSDATE AND ADD_MONTHS(SYSDATE, -60)
    AND CID = ID;

    SELECT COUNT(*) INTO DEP FROM AIRPORTSLOG WHERE NAME = (
        SELECT NAME FROM CITIZEN WHERE CITIZEN.ID = ID
    ) AND TP = 'DEPARTURE' AND 
    DT BETWEEN SYSDATE AND ADD_MONTHS(SYSDATE, -60);

    IF(SAL > 100000) AND (DEP = 10) THEN
        DOMAIN :='CIP';
    ELSIF (SAL> 50000) AND (SAL<100000) AND (DEP = 5) THEN
        DOMAIN :='VIP';
    ELSE
        DOMAIN :='ORDINARY';
    END IF;

RETURN DOMAIN;
END;
/
