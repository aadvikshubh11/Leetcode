# Write your MySQL query statement below
select e.name AS name , eu.unique_id As Unique_id
FROM Employees e  
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
