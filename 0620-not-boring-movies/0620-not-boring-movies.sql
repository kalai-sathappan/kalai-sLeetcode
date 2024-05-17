# Write your MySQL query statement below
SELECT * from Cinema where (Cinema.id%2!=0) && Cinema.description!="boring" Order by Cinema.rating DESC;