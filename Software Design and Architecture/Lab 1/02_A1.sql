use kids_shop;
create table customer (
    id int not null auto_increment primary key,
    name varchar(100)
);

alter table rating
    add column rater_id int not null,
    add column rating_datetime timestamp;