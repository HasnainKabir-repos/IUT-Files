use reporting_db;

DELIMITER //
drop procedure if exists get_top3_products;
create procedure get_top3_products() 
begin
	select * from dim_product order by average_rating desc limit 3 ;
end //

DELIMITER ;

call get_top3_products();
