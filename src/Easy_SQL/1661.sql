/*
https://leetcode.com/problems/average-time-of-process-per-machine/?envType=study-plan-v2&envId=top-sql-50
Average Time of Process per Machine
Write your T-SQL query statement below */
SELECT a1.machine_id, CAST(AVG(a2.timestamp - a1.timestamp) AS DECIMAL(10,3)) AS processing_time
FROM Activity a1, Activity a2
WHERE a1.machine_id = a2.machine_id
  AND a1.process_id = a2.process_id
  AND a1.activity_type = 'start'
  AND a2.activity_type = 'end'
GROUP BY a1.machine_id
ORDER BY processing_time;