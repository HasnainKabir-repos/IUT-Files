drop table NID cascade constraints;
drop table driving_license cascade constraints;
drop table accident cascade constraints;
drop table division cascade constraints;
drop table district cascade constraints;
drop table hospital cascade constraints;
drop table admittedTo cascade constraints;

CREATE OR REPLACE TYPE vmobiles as varray(10) of varchar2(20);

CREATE TABLE NID(
    NID_no INT primary key,
    Name varchar2(20),
    Date_of_birth DATE,
    Occupation varchar2(20),
    Blood_group varchar2(5)
);

CREATE TABLE driving_license(
    DV_no INT primary key,
    Type_of_license varchar2(20),
    Issue_date DATE,
    Expiration_date DATE,
    NID references NID NOT NULL
);

CREATE TABLE accident(
    date_of_accident Date primary key,
    time_of_accident timestamp,
    location varchar2(20),
    number_of_deaths number,
    license_no references driving_license NOT NULL
);

CREATE TABLE division(
    Name varchar2(20) primary key,
    size_of_division number,
    Description varchar2(250)
);


CREATE TABLE district(
    Name varchar2(20) primary key,
    size_of_district number,
    Description varchar2(250),
    division references division NOT NULL
);


ALTER TABLE NID ADD division references division;
ALTER TABLE NID ADD district references district;

CREATE TABLE hospital(
    HID number primary key,
    Name varchar2(20),
    contact_no vmobiles
);

CREATE TABLE admittedTo(
    date_of_admission date,
    Description varchar2(250),
    date_of_release date,
    NID references NID NOT NULL,
    HID references hospital NOT NULL
);

--A
SELECT count(Name), division FROM district GROUP BY division;

--B
SELECT district FROM NID GROUP BY district HAVING count(Name) > 20000;

--C
SELECT count(date_of_accident) FROM accident GROUP BY license_no HAVING license_no = 
(SELECT DV_no FROM driving_license WHERE NID = 210);

--D
SELECT name FROM hospital WHERE HID = (SELECT HID FROM admittedTo GROUP BY HID 
ORDER BY  count(NID) DESC HAVING ROWNUM < 6);

--E
SELECT Blood_group FROM NID WHERE NID.NID_no in (SELECT NID FROM admittedTo);

--F
SELECT name, pop/size_of_division as density FROM 
(SELECT division, count(NID_no) as pop FROM NID GROUP BY division), division 
WHERE name = division ;

--G
SELECT name, pop/size_of_division as density FROM 
(SELECT division, count(NID_no) as pop FROM NID GROUP BY division), division 
WHERE name = division GROUP BY name ORDER BY density DESC HAVING ROWNUM <= 3;

--H
SELECT district, COUNT(NID_NO) FROM NID WHERE NID_NO IN 
(SELECT NID FROM driving_license,accident WHERE 
DV_no =license_no) GROUP BY district;

--I
SELECT division, COUNT(NID_NO) AS NUM FROM NID WHERE NID_NO IN 
(SELECT NID FROM driving_license,accident WHERE 
DV_no =license_no) GROUP BY division ORDER BY NUM WHERE ROWNUM <=1;

--J
SELECT Type_of_license, COUNT(DV_no) FROM driving_license WHERE DV_no
IN (SELECT license_no FROM accident) GROUP BY Type_of_license;

--K
SELECT NID.name
FROM NID,AdmittedTO
WHERE NID.NID_NO=AdmittedTO.NID AND longestDate IN (
    SELECT max(datediff(AdmittedTO.date_of_release,Admitted.date_of_admission)) longestDate
        FROM AdmittedTO
);



--M
SELECT DV_no FROM driving_license WHERE Expiration_date < CURRENT_DATE;

--N
SELECT COUNT(DV_no) FROM driving_license WHERE Expiration_date < CURRENT_DATE
AND DV_no IN (SELECT license_no FROM accident);

--O
SELECT DV_no FROM driving_license 
AND DV_no NOT IN (SELECT license_no FROM accident);


--P
SELECT MAX(number_of_deaths), DIV.name FROM Accident A, 
driving_license D, NID N, Division DIV WHERE A.LICENSE_NO = D.DV_no
AND N.NID_NO = D.NID AND N.Division = DIV.Name GROUP BY DIV.NAME;

--Q
SELECT N.NAME FROM NID N, driving_license D WHERE N.NID_NO = D.NID AND
DATE_FORMAT(FROM_DAYS(DATEDIFF(D.Issue_date,N.Date_of_birth)), '%Y') + 0
in (SELECT DATE_FORMAT(FROM_DAYS(DATEDIFF(D.Issue_date,Date_of_birth)), '%Y') + 0 AS AGE
FROM NID,driving_license
where AGE<=22 and AGE <=30);

--R
SELECT N.NAME FROM NID N, admittedTo ADT WHERE N.NID_NO = ADT.NID AND
ADT.date_of_admission IN (SELECT date_of_accident FROM Accident);

--S
SELECT MAX(H.NAME), DIV.NAME FROM (
    SELECT H.NAME, DIV.NAME  FROM Hospital H, admittedTo ADT, NID N, 
    division DIV  WHERE H.HID = ADT.HID AND
    N.NID_NO = ADT.NID AND  DIV.NAME = N.DIVISION
) GROUP BY DIV.NAME HAVING DIV.NAME = "DHAKA";

