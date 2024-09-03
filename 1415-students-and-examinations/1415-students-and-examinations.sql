# Write your MySQL query statement below
select students.student_id, students.student_name, subjects.subject_name, count(Examinations.student_id) as attended_exams
from students  cross join subjects 
left outer join examinations
on examinations.subject_name = subjects.subject_name and  students.student_id =  Examinations.student_id
group by Examinations.student_id, subjects.subject_name, students.student_name
order by students.student_id, subjects.subject_name