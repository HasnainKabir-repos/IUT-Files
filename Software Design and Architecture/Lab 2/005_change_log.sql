use kids_shop;
drop table if exists change_log;
create table change_log(
	id int not null auto_increment primary key, 
	applied_at timestamp,
    created_by int,
    script_name varchar(100),
    script_details varchar(200)
);

insert into change_log (applied_at, created_by, script_name, script_details)
values (NOW(), 01, "005_change_log", "Created change log schema");