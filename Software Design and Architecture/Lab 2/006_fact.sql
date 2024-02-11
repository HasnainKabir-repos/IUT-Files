use reporting_db;
drop table if exists fact_sale;

create table fact_sale(
	id int not null auto_increment primary key,
	category_id int, 
	employee_id int,
    product_id int,
    rating_id int,
    sale_id int
);

drop table if exists dim_category;
drop table if exists dim_product;
drop table if exists dim_employee;
drop table if exists dim_rating;
drop table if exists dim_sale;

create table dim_category(
    id int not null auto_increment primary key,
    name varchar(100)
);

create table dim_product (
    id int not null auto_increment primary key,
    name varchar(100),
    category_id int not null,
    average_rating int not null default 0
);

create table dim_rating (
	id int not null auto_increment primary key,
    product_id int not null,
    rating_value int,
    rating_datetime timestamp
);

create table dim_employee (
    id int primary key auto_increment,
    name varchar(255) not null
);

create table dim_sale(
	sale_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    employee_id INT,
    customer_id INT,
    sale_timestamp TIMESTAMP
);
