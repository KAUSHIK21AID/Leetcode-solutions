# Write your MySQL query statement below
-- SELECT reports_to as employee_id,(SELECT e.name FROM Employees e where e.employee_id = reports_to limit 1) as name, COUNT(employee_id) as reports_count, AVG(age) as average_age
-- FROM Employees
-- WHERE (employee_id, reports_to) IN
-- (SELECT employee_id,reports_to
-- FROM Employees
-- WHERE reports_to IS NOT NULL)
-- GROUP BY reports_to

SELECT e1.employee_id, e1.name, COUNT(e2.reports_to) AS reports_count, ROUND(avg(e2.age)) as average_age
FROM Employees e1 JOIN Employees e2 ON e1.employee_id=e2.reports_to
GROUP BY e1.employee_id
ORDER BY e1.employee_id ASC

-- SELECT e1.employee_id, e1.name, COUNT(e1.employee_id) as report_count, avg(e1.age) as average_age
-- FROM Employees e1 JOIN Employees e2 ON e1.employee_id=e2.reports_to
-- GROUP BY reports_to
