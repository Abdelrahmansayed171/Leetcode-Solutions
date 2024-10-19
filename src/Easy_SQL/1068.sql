/*
https://leetcode.com/problems/product-sales-analysis-i/?envType=study-plan-v2&envId=top-sql-50
Product Sales Analysis I

Write your T-SQL query statement below
*/
SELECT P.product_name, S.year, S.price
FROM Sales S
JOIN Product P on P.product_id = S.product_id