-- Write your PostgreSQL query statement below

SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) rank
FROM Scores;
