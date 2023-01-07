drop table branch cascade constraints;
drop table employee cascade constraints;
drop table employee_Position;
drop table client cascade constraints;
drop table house cascade constraints;
drop table owner;

CREATE TABLE branch(
    B_ID INT primary key,
    Street varchar2(20),
    city varchar2(20),
    postcode number(4)
);

CREATE TABLE employee_Position(
    position varchar2(20) primary key,
    salary INT
);

CREATE TABLE employee(
    E_ID INT primary key,
    Firstname varchar2(20),
    Lastname varchar2(20),
    Gender varchar2(4),
    Date_of_birth DATE,
    branch references branch not null,
    position references employee_Position not null
);

CREATE TABLE client(
    C_ID INT primary key,
    Firstname varchar2(20),
    Lastname varchar2(20),
    Telephone_no varchar2(12),
    Email varchar2(30),
    preferred_type varchar2(10),
    max_rent INT,
    Staff references employee not null
);

CREATE TABLE client_registration(
    C_ID references client,
    branch references branch,
    primary key (C_ID, branch)
);

CREATE TABLE House(
    H_ID INT primary key,
    Street varchar2(20),
    city varchar2(20),
    postcode number(4),
    type varchar2(20),
    No_of_rooms number,
    rent number,
    staff references Employee not null
);

CREATE TABLE visits(
    C_ID references client,
    H_ID references House,
    date_of_visit Date not null,
    comments varchar2(100),
    primary key(C_ID, H_ID, date_of_visit)
);

CREATE TABLE owner(
    O_ID INT primary key,
    Firstname varchar2(20),
    Lastname varchar2(20),
    Telephone_no varchar2(12),
    Email varchar2(30),
    Password varchar2(100)
);

ALTER TABLE House ADD owner references owner;