# Write your MySQL query SELECT class
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;