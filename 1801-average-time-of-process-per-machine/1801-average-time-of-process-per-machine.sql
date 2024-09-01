# Write your MySQL query statement below

SELECT E.machine_id,  ROUND(AVG(E.timestamp - S.timestamp), 3) AS processing_time
FROM ACTIVITY  S JOIN ACTIVITY E
ON E.machine_id = S.machine_id
WHERE S.activity_type = 'start' and E.activity_type= 'end'
GROUP BY S.machine_id