use kids_shop;

create table employee (
    id int primary key auto_increment,
    name varchar(255) not null
);

CREATE TABLE invoice (
    invoice_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    seller_id INT,
    invoice_time TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE sale (
    sale_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    employee_id INT,
    customer_id INT,
    sale_timestamp TIMESTAMP,
    FOREIGN KEY (product_id) REFERENCES product(id),
    FOREIGN KEY (employee_id) REFERENCES employee(id),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

insert into change_log (applied_at, created_by, script_name, script_details)
values (NOW(), 01, "002_A2", "Created employee, sale, invoice schema");
