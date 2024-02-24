use kids_shop;
create table customer (
    id int not null auto_increment primary key,
    name varchar(100)
);

alter table rating
    add column rater_id int not null,
    add column rating_datetime timestamp;
    
insert into change_log (applied_at, created_by, script_name, script_details)
values (NOW(), 02, "002_A1", "Created customer and rating schema");
