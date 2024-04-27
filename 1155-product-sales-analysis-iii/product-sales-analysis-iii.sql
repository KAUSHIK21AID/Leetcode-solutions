# Write your MySQL query statement below
SELECT s.product_id, year as first_year, quantity, price
FROM Sales s JOIN Product p ON s.product_id=p.product_id
WHERE (s.product_id, year) in
(SELECT product_id, min(year) as y
FROM Sales
GROUP BY product_id)

#subquery