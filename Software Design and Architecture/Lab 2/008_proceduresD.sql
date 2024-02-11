use reporting_db;

DELIMITER //

drop procedure if exists get_top_product_by_category;

create procedure get_top_product_by_category(
	in category_id int
) 
begin
	SELECT dp.name AS product_name, MAX(dr.rating_value) AS top_rating
    FROM dim_product dp
    INNER JOIN dim_rating dr ON dp.id = dr.product_id
    WHERE dp.category_id = category_id
    GROUP BY dp.name
    ORDER BY top_rating DESC
    LIMIT 1;
end //

DELIMITER ;

call get_top_product_by_category(1);
