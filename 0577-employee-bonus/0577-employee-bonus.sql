# Write your MySQL query statement below
SELECT name , bonus 
FROM EMPLOYEE  LEFT OUTER JOIN BONUS
ON EMPLOYEE.empId = BONUS.empId
WHERE bonus <1000 OR BONUS IS NULL;