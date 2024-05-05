# Write your MySQL query statement below
(SELECT u.name as results
FROM Users u JOIN MovieRating m ON u.user_id=m.user_id
GROUP BY m.user_id
ORDER BY COUNT(*) DESC, u.name ASC
LIMIT 1
)
UNION ALL
(
SELECT m.title as results
FROM Movies m JOIN MovieRating mm ON m.movie_id = mm.movie_id
WHERE MONTH(mm.created_at) = 02 AND YEAR(mm.created_at) = 2020
GROUP BY mm.movie_id
ORDER BY AVG(mm.rating) DESC, m.title ASC
LIMIT 1
)