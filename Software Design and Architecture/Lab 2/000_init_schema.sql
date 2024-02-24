use kids_shop;
drop table if exists category;
drop table if exists sale;
drop table if exists product;
drop table if exists invoice;
drop table if exists vote;
drop table if exists rating;
drop table if exists customer;
drop table if exists change_log;
drop table if exists employee;

create table category (
    id int not null auto_increment primary key,
    name varchar(100)
);

create table product (
    id int not null auto_increment primary key,
    name varchar(100),
    category_id int not null,
    votes int not null default 0
);

create table vote (
    id int not null auto_increment primary key,
    product_id int not null,
    is_up_vote bit
);

drop procedure if exists recalculate_product_votes;

delimiter //
create procedure recalculate_product_votes()
begin
    update product p
        set votes =
            (select count(*) from vote where product_id = p.id and is_up_vote = true)
            - (select count(*) from vote where product_id = p.id and is_up_vote = false)
    where 1 = 1;
end;//
delimiter ;


insert into category (name) values
    ('toys'),
    ('cloths'),
    ('diaper');

insert into product (name, category_id) values
    ('light ball', 1),
    ('blocks', 1),
    ('cool red shirt', 2),
    ('long blue skirt', 2),
    ('nice green pants', 2),
    ('kids comfi', 3);

insert into vote(product_id, is_up_vote) values
    (1, true),
    (1, true),
    (1, false),
    (2, false),
    (2, false),
    (3, true),
    (3, true),
    (5, false),
    (5, true),
    (5, true),
    (5, true);


drop procedure if exists calculate_average_ratings;

delimiter //
create procedure calculate_average_ratings()
begin
    alter table vote rename to rating;
    alter table rating modify column is_up_vote int;
    
	update rating
		set is_up_vote = 5
	where is_up_vote = 1;
    update rating
		set is_up_vote = 1
	where is_up_vote = 0;
    
    alter table product rename column votes to average_rating;
    alter table rating rename column is_up_vote to rating_value;
    
    update product p
    set average_rating =
		(select IFNULL(avg(rating_value), 0) from rating r where r.product_id = p.id);
end;//
delimiter ;

call calculate_average_ratings();
