# Write your MySQL query statement below
SELECT product_name,year,price from Sales INNER JOIN Product on Sales.product_id = Product.product_id;