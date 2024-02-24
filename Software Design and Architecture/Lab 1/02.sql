use kids_shop;

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

