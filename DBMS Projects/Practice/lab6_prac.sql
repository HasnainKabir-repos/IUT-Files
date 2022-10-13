drop table branch cascade constraints;
drop table employee cascade constraints;
drop table Book cascade constraints;
drop table works cascade constraints;

CREATE TABLE Branch(
    B_ID INT primary key,
    Location Varchar2(100),
    Year_Of_Establishment number(4)
    );
    

CREATE TABLE Employee(
    NID INT primary key,
    Name Varchar2(20),
    Blood_Group Varchar2(5),
    Birth_date DATE
);

CREATE TABLE works(
    B_ID references Branch,
    NID references Employee,
    primary key(B_ID, NID)
);    
    
CREATE TABLE Book(
    name varchar2(20),
    author varchar2(20),
    Genre varchar(10),
    Price INT,
    ISBN char(14) primary key,
    Branch_ID INT references Branch on delete set NULL
);

CREATE TABLE publisher(
    name varchar2(20),
    city varchar2(20),
    Year_of_establishment number(4),
    ISBN references Book
);

