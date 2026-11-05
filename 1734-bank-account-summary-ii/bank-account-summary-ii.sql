# Write your MySQL query statement below
SELECT name, balance
FROM Users
JOIN (
    SELECT account, SUM(amount) AS balance
    FROM Transactions
    GROUP BY account
    HAVING SUM(amount) > 10000
) t
ON Users.account = t.account;