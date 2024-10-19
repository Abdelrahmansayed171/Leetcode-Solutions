/*
https://leetcode.com/problems/rising-temperature/?envType=study-plan-v2&envId=top-sql-50
Rising Temperature
Write your T-SQL query statement below */
SELECT W2.id
FROM Weather w1 LEFT JOIN Weather w2 on w1.recordDate = DATEADD(day, -1, w2.recordDate)
WHERE W1.temperature < W2.temperature;
