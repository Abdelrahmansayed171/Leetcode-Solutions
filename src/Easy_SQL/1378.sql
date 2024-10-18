/*
    https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/?envType=study-plan-v2&envId=top-sql-50
    Replace Employee ID With The Unique Identifier
*/
/* Write your T-SQL query statement below */

SELECT EU.unique_id, E.name
FROM Employees E
         LEFT JOIN EmployeeUNI EU ON E.id = EU.id;