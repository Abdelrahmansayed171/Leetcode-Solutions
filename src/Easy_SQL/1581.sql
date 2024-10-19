/*
https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/?envType=study-plan-v2&envId=top-sql-50
Customer Who Visited but Did Not Make Any Transactions
Write your T-SQL query statement below */
SELECT V.customer_id, COUNT(V.visit_id) AS count_no_trans
FROM Visits V LEFT JOIN Transactions T on V.visit_id = T.visit_id
WHERE T.visit_id is NULL
GROUP BY V.customer_id
ORDER BY count_no_trans;