DROP TABLE Transaction;
DROP TABLE Balance;
DROP TABLE AccountProperty;
DROP TABLE Account CASCADE CONSTRAINTS;

CREATE TABLE Transaction(
    TID INT PRIMARY KEY,
    AccNo INT,
    Amount NUMERIC,
    TransactionDate TIMESTAMP,
    FOREIGN KEY (AccNo) references Account
);

CREATE TABLE Balance(
    AccNo INT,
    PrincipalAmount NUMERIC,
    ProfitAmount NUMERIC,
    FOREIGN KEY (AccNo) references Account
);

CREATE TABLE AccountProperty(
    ID INT PRIMARY KEY,
    Name VARCHAR2(20),
    ProfitRate NUMERIC,
    GracePeriod INT  
);

CREATE TABLE Account(
    ID INT PRIMARY KEY,
    Name VARCHAR2(20),
    AccCode INT UNIQUE,
    OpeningDate TIMESTAMP,
    LastDateInterest TIMESTAMP,
    FOREIGN KEY (AccCode) references AccountProperty
);

INSERT INTO Account VALUES(1, 'Mamun', 2002, TO_TIMESTAMP('12-JAN-2020 11:45:00','DD-MON-YYYY HH24:MI:SS'), 
TO_TIMESTAMP('25-JAN-2023 11:45:00','DD-MON-YYYY HH24:MI:SS'));
INSERT INTO Account VALUES(2, 'Tahlil', 3003, TO_TIMESTAMP('11-JUN-2018 13:15:00','DD-MON-YYYY HH24:MI:SS'),
TO_TIMESTAMP('13-SEP-2022 11:45:00','DD-MON-YYYY HH24:MI:SS'));
INSERT INTO Account VALUES(3, 'Ridun', 4004, TO_TIMESTAMP('30-MAR-2016 8:45:00','DD-MON-YYYY HH24:MI:SS'),
TO_TIMESTAMP('21-AUG-2022 11:45:00','DD-MON-YYYY HH24:MI:SS'));
INSERT INTO Account VALUES(4, 'Muaz', 5005, TO_TIMESTAMP('21-JULY-2019 9:20:00','DD-MON-YYYY HH24:MI:SS'),
TO_TIMESTAMP('30-MAR-2022 11:45:00','DD-MON-YYYY HH24:MI:SS'));

INSERT INTO AccountProperty VALUES(2002, 'monthly', 2.8, 1);
INSERT INTO AccountProperty VALUES(3003, 'quarterly', 4.2, 4);
INSERT INTO AccountProperty VALUES(4004, 'biyearly', 6.8, 6);
INSERT INTO AccountProperty VALUES(5005, 'yearly', 8, 1);



--1
CREATE OR REPLACE FUNCTION CALCULATE_BALANCE(ACC_NO INT)
RETURN NUMERIC
AS
    CURRENT_BALANCE Balance.PrincipalAmount%TYPE;
BEGIN 
    
    SELECT PrincipalAmount INTO CURRENT_BALANCE FROM Balance WHERE AccNo = ACC_NO;
    
    FOR I IN 
    (SELECT Amount FROM Transaction WHERE AccNo = ACC_NO) loop
      CURRENT_BALANCE:= CURRENT_BALANCE+I.Amount;
    end loop;
END;
/

--2

CREATE OR REPLACE TYPE BALANCE_TYPE AS OBJECT(
    PROFIT NUMERIC,
    BALANCE_BEFORE NUMERIC,
    BALANCE_AFTER NUMERIC
);
/

CREATE OR REPLACE TYPE BALANCE_TABLE AS TABLE OF BALANCE_TYPE;
/

CREATE OR REPLACE FUNCTION CALCULATE_PROFIT(ACCOUNT_ID INT)
RETURN BALANCE_TABLE
IS
    BT BALANCE_TABLE;
    BALANCE_BEFORE NUMERIC;
    BALANCE_AFTER NUMERIC;
    PROFIT NUMERIC;
    MONTHS NUMERIC;
    GRACE_PERIOD INT;
BEGIN 
    SELECT PrincipalAmount INTO BALANCE_BEFORE 
    FROM Balance WHERE AccNo = ACCOUNT_ID;

    SELECT MONTHS_BETWEEN(SYSDATE, LastDateInterest) INTO MONTHS FROM Account
    WHERE ID = ACCOUNT_ID;

    SELECT GracePeriod INTO GRACE_PERIOD
    FROM AccountProperty WHERE ID = (
        SELECT AccCode FROM Account WHERE ID = Account.ID
    );

    SELECT ProfitRate INTO PROFIT
    FROM AccountProperty WHERE ID = (
        SELECT AccCode FROM Account WHERE ID = Account.ID
    );

    IF(MOD(MONTHS, GRACE_PERIOD) = 0) THEN
        PROFIT := BALANCE_BEFORE * (PROFIT/100) * (MONTHS / GRACE_PERIOD);
    ELSIF(MONTHS > GRACE_PERIOD) THEN
        PROFIT := BALANCE_BEFORE * (PROFIT/100) * (MOD(MONTHS, GRACE_PERIOD));
    END IF; 

    BALANCE_AFTER := BALANCE_BEFORE + PROFIT;

    SELECT BALANCE_TYPE(PROFIT, BALANCE_BEFORE, BALANCE_AFTER) BULK COLLECT INTO BT FROM DUAL;

RETURN BT;
END;
/

--3

CREATE OR REPLACE PROCEDURE PROFIT_INSERTION
IS 
CURR_PROFIT NUMERIC;

CURSOR C1 (GIVEN_ID INT) IS 
SELECT PROFIT FROM TABLE (CALCULATE_PROFIT(GIVEN_ID));

BEGIN   
    FOR I IN (SELECT ID FROM ACCOUNT) LOOP 
        OPEN C1(I.ID);
        FETCH C1 INTO CURR_PROFIT;
        EXIT WHEN C1%NOTFOUND;
        INSERT INTO BALANCE (AccNo, ProfitAmount) VALUES (I.ID, CURR_PROFIT);
    END LOOP;
END ;
/


