# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
SELECT DISTINCT D.name AS Department, E.name AS Employee, E.salary AS Salary
FROM Employee E
JOIN Department D ON E.departmentId = D.id
WHERE 3 > (
    SELECT COUNT(DISTINCT B.salary)
    FROM Employee B
    WHERE B.departmentId = E.departmentId AND B.salary > E.salary
);
