# Write your MySQL query statement below
Select student from Courses 
group by class 
Having count(*)>=5;