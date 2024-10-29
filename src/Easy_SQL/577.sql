/*
https://leetcode.com/problems/employee-bonus/?envType=study-plan-v2&envId=top-sql-50
Employee Bonus
*/
/* Write your T-SQL query statement below */
SELECT E.name, B.bonus
FROM Employee E LEFT JOIN Bonus B ON E.empId = B.empId
WHERE B.bonus < 1000 OR B.bonus IS NULL ;