insert into reporting_db.dim_category (id, name)
select id, name 
from kids_shop.category;

insert into reporting_db.dim_product (id, name, category_id, average_rating)
select id, name, category_id, average_rating
from kids_Shop.product;

insert into reporting_db.dim_rating(id, product_id, rating_value, rating_datetime)
select id, product_id, rating_value, now()
from kids_shop.rating;

insert into reporting_db.dim_employee(id, name)
select *
from kids_shop.employee;