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

SELECT count(Name), division FROM district GROUP BY division;

SELECT district FROM NID GROUP BY district HAVING count(Name) > 20000;

SELECT count(date_of_accident) FROM accident GROUP BY license_no HAVING license_no = 
(SELECT DV_no FROM driving_license WHERE NID = 210);

SELECT name FROM hospital WHERE HID = (SELECT HID FROM admittedTo GROUP BY HID 
ORDER BY  count(NID) DESC HAVING ROWNUM < 6);