use kids_shop;

DELIMITER //

CREATE PROCEDURE add_rating(
    IN p_product_id INT,
    IN p_rating_value INT,
    IN p_rater_id INT
)
BEGIN
    INSERT INTO rating (product_id, rating_value, rater_id, rating_datetime)
    VALUES (p_product_id, p_rating_value, p_rater_id, NOW());
    
    UPDATE product
    SET average_rating = (
        SELECT ifnull( avg(rating_value), 0 )
        FROM rating 
        WHERE product_id = p_product_id
    )
    WHERE product_id = p_product_id;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE get_average_rating(
    IN p_product_id INT,
    OUT p_average_rating DECIMAL(3, 2) 
)
BEGIN
    SELECT AVG(rating_value) INTO p_average_rating
    FROM rating
    WHERE product_id = p_product_id;
END //

DELIMITER ;

insert into change_log (applied_at, created_by, script_name, script_details)
values (NOW(), 01, "003_B1", "Created stored procedures add_rating and get_average_rating");
