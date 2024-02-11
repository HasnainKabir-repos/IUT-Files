use kids_shop;

DELIMITER //

CREATE PROCEDURE get_sale_per_category(
    IN p_employee_id INT
)
BEGIN
    SELECT 
        p.category,
        COUNT(*) AS sales_count
    FROM 
        sale s
    INNER JOIN 
        product p ON s.product_id = p.id
    WHERE 
        s.employee_id = p_employee_id
    GROUP BY 
        p.category;
END //

DELIMITER ;

DELIMITER //


CREATE PROCEDURE set_product_category (
	IN p_product_id INT, 
    IN p_category_id INT
)
BEGIN
    UPDATE product
    SET category_id = p_category_id
    WHERE id = p_product_id;
END //

DELIMITER ;

insert into change_log (applied_at, created_by, script_name, script_details)
values (NOW(), 01, "004_B2", "Created stored procedures get_sale_per_category and set_product_category");
