# Write your MySQL query statement below
select  Max(num) as num from (select num from MyNumbers
group by num 
having count(num)=1 ) number;