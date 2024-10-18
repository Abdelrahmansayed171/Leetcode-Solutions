/*
https://leetcode.com/problems/invalid-tweets/description/?envType=study-plan-v2&envId=top-sql-50
Invalid Tweets - MSSQL
*/

/* Write your T-SQL query statement below */
SELECT tweet_id
FROM Tweets
WHERE LEN(content) > 15;