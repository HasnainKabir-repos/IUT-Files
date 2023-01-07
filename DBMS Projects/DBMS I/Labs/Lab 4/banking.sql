drop table depositor;
drop table borrower;
drop table account;
drop table loan;
drop table customer;
drop table branch;

create table branch
   (branch_name 	varchar(15)	not null,
    branch_city 	varchar(15)	not null,
    assets 	number not null,
    primary key(branch_name));
    
create table customer
   (customer_name 	varchar(15)	not null,
    customer_street 	varchar(12)	not null,
    customer_city 	varchar(15)	not null,
    primary key(customer_name));

create table account
   (account_number 	varchar(15)	not null,
    branch_name varchar(15)	not null,
    balance 		number not null,
    primary key(account_number),
    foreign key(branch_name) references branch(branch_name));


create table loan
   (loan_number varchar(15)	not null,
    branch_name varchar(15)	not null,
    amount 	number not null,
    primary key(loan_number),
    foreign key(branch_name) references branch(branch_name));

create table depositor
   (customer_name varchar(15) not null,
    account_number varchar(15) not null,
    primary key(customer_name, account_number),
    foreign key(account_number) references account(account_number),
    foreign key(customer_name) references customer(customer_name));

create table borrower
   (customer_name  varchar(15)	not null,
    loan_number  varchar(15)	not null,
    primary key(customer_name, loan_number),
    foreign key(customer_name) references customer(customer_name),
    foreign key(loan_number) references loan(loan_number));

/* populate relations */

insert into customer values ('Jones',	'Main',		'Harrison');
insert into customer values ('Smith',	'Main',		'Rye');
insert into customer values ('Hayes',	'Main',		'Harrison');
insert into customer values ('Curry',	'North',	'Rye');
insert into customer values ('Lindsay',	'Park',		'Pittsfield');
insert into customer values ('Turner',	'Putnam',	'Stamford');
insert into customer values ('Williams',	'Nassau',	'Princeton');
insert into customer values ('Adams',	'Spring',	'Pittsfield');
insert into customer values ('Johnson',	'Alma',		'Palo Alto');
insert into customer values ('Glenn',	'Sand Hill',	'Woodside');
insert into customer values ('Brooks',	'Senator',	'Brooklyn');
insert into customer values ('Green',	'Walnut',	'Stamford');
insert into customer values ('Jackson',	'University',	'Salt Lake');
insert into customer values ('Majeris',	'First',	'Rye');
insert into customer values ('McBride',	'Safety',	'Rye');

insert into branch values ('Downtown',	'Brooklyn',	 900000);
insert into branch values ('Redwood',	'Palo Alto',	2100000);
insert into branch values ('Perryridge',	'Horseneck',	1700000);
insert into branch values ('Mianus',	'Horseneck',	 400200);
insert into branch values ('Round Hill',	'Horseneck',	8000000);
insert into branch values ('Pownal',	'Bennington',	 400000);
insert into branch values ('North Town',	'Rye',		3700000);
insert into branch values ('Brighton',	'Brooklyn',	7000000);
insert into branch values ('Central',	'Rye',		 400280);

insert into account values ('A-101',	'Downtown',	500);
insert into account values ('A-215',	'Mianus',	700);
insert into account values ('A-102',	'Perryridge',	400);
insert into account values ('A-305',	'Round Hill',	350);
insert into account values ('A-201',	'Perryridge',	900);
insert into account values ('A-222',	'Redwood',	700);
insert into account values ('A-217',	'Brighton',	750);
insert into account values ('A-333',	'Central',	850);
insert into account values ('A-444',	'North Town',	625);

insert into depositor values ('Johnson','A-101');
insert into depositor values ('Smith',	'A-215');
insert into depositor values ('Hayes',	'A-102');
insert into depositor values ('Hayes',	'A-101');
insert into depositor values ('Turner',	'A-305');
insert into depositor values ('Johnson','A-201');
insert into depositor values ('Jones',	'A-217');
insert into depositor values ('Lindsay','A-222');
insert into depositor values ('Majeris','A-333');
insert into depositor values ('Smith',	'A-444');

insert into loan values ('L-17',		'Downtown',	1000);
insert into loan values ('L-23',		'Redwood',	2000);
insert into loan values ('L-15',		'Perryridge',	1500);
insert into loan values ('L-14',		'Downtown',	1500);
insert into loan values ('L-93',		'Mianus',	500);
insert into loan values ('L-11',		'Round Hill',	900);
insert into loan values ('L-16',		'Perryridge',	1300);
insert into loan values ('L-20',		'North Town',	7500);
insert into loan values ('L-21',		'Central',	570);

insert into borrower values ('Jones',	'L-17');
insert into borrower values ('Smith',	'L-23');
insert into borrower values ('Hayes',	'L-15');
insert into borrower values ('Jackson',	'L-14');
insert into borrower values ('Curry',	'L-93');
insert into borrower values ('Smith',	'L-11');
insert into borrower values ('Williams','L-17');
insert into borrower values ('Adams',	'L-16');
insert into borrower values ('McBride',	'L-20');
insert into borrower values ('Smith',	'L-21');

commit;

--1
SELECT distinct depositor.customer_name FROM depositor,borrower 
WHERE depositor.customer_name = borrower.customer_name;

SELECT customer_name FROM depositor 
INTERSECT 
SELECT customer_name FROM borrower;

--2
SELECT distinct customer.customer_name,customer_city,customer_street 
FROM customer,depositor,borrower
WHERE customer.customer_name = depositor.customer_name OR
customer.customer_name = borrower.customer_name ;

SELECT customer.customer_name,customer_street,customer_city FROM customer,borrower
WHERE customer.customer_name = borrower.customer_name
UNION
SELECT customer.customer_name,customer_street,customer_city FROM customer,depositor
WHERE customer.customer_name = depositor.customer_name;

--3
SELECT distinct customer.customer_name, customer_city
FROM customer,borrower,depositor
WHERE customer.customer_name = borrower.customer_name AND
customer.customer_name NOT IN (
SELECT distinct customer.customer_name 
FROM customer,borrower,depositor
WHERE customer.customer_name = borrower.customer_name AND customer.customer_name = depositor.customer_name);

SELECT distinct customer.customer_name, customer_city
FROM customer, borrower
WHERE customer.customer_name = borrower.customer_name
MINUS 
SELECT distinct customer.customer_name, customer_city
FROM customer, depositor
WHERE customer.customer_name = depositor.customer_name;

--4
SELECT sum(assets) FROM branch;

--5
SELECT branch_city,count(account_number) FROM branch,
account WHERE account.branch_name = branch.branch_name
GROUP BY branch_city;

--6
SELECT  branch_name,avg(balance) FROM account
GROUP BY branch_name ORDER BY avg(balance) DESC;

--7
SELECT branch_city,sum(balance) FROM account, 
branch WHERE branch.branch_name = account.branch_name
GROUP BY branch_city;



--8
SELECT loan.branch_name, avg(amount) FROM loan
,branch WHERE branch.branch_name = loan.branch_name AND
branch_city != 'Horseneck'
GROUP BY loan.branch_name;

SELECT avg(amount), max(branch.branch_name)
FROM branch,loan
WHERE branch.branch_name=loan.branch_name
GROUP BY branch.branch_city
HAVING branch.branch_city!='Horseneck';


--9
SELECT customer_name, account.account_number FROM
 depositor, account WHERE depositor.account_number
= account.account_number AND account.balance IN (SELECT max(balance)
FROM account);

SELECT customer_name, account.account_number FROM
 depositor, account WHERE depositor.account_number
= account.account_number AND account.balance = all (SELECT max(balance)
FROM account);


--10
SELECT distinct c.customer_name, c.customer_city, c.customer_street
FROM customer c, branch b, account a,depositor d
WHERE c.customer_city = b.branch_city
AND d.account_number = a.account_number 
AND d.customer_name = c.customer_name AND a.branch_name = b.branch_name;

--11
SELECT branch_city, avg(amount) FROM branch b, loan l
WHERE b.branch_name = l.branch_name 
GROUP BY branch_city 
HAVING avg(amount) > 1500;

SELECT * FROM 
(SELECT branch_city, avg(amount) as av FROM branch b, loan l WHERE b.branch_name = l.branch_name 
GROUP BY branch_city)A WHERE A.av>1500;

--12
SELECT distinct b.branch_name FROM branch b, account a 
WHERE b.branch_name = a.branch_name GROUP BY
b.branch_name HAVING sum(balance) > avg(balance);

--13
SELECT  d.customer_name, max(a.balance), min(l.amount) FROM depositor d,account a, borrower b, loan l 
WHERE d.customer_name = b.customer_name AND d.account_number = a.account_number
AND b.loan_number = l.loan_number GROUP BY (d.customer_name)
HAVING sum(balance) > min(amount);
