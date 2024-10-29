/*
https://leetcode.com/problems/students-and-examinations/?envType=study-plan-v2&envId=top-sql-50
Students and Examinations
Write your T-SQL query statement below
*/
SELECT std.student_id, std.student_name, S.subject_name, COUNT(ex.subject_name) AS attended_exams
FROM Students std CROSS JOIN Subjects S LEFT JOIN Examinations ex ON std.student_id = ex.student_id AND S.subject_name = ex.subject_name
GROUP BY  std.student_id, std.student_name, S.subject_name
ORDER BY std.student_id, S.subject_name;