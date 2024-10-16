/* https://leetcode.com/problems/big-countries/submissions/1424054270/?envType=study-plan-v2&envId=top-sql-50
   Big Countries
*/
SELECT name, population, area
FROM World
WHERE area >= '3000000' OR population >= '25000000'