/*
 * HackerRank - Top Competitors (SQL > Basic Join)
 */


SELECT 
    S.hacker_id,
    H.name
FROM Submissions AS S
INNER JOIN Challenges AS C ON C.challenge_id = S.challenge_id
INNER JOIN Difficulty AS D ON C.difficulty_level = D.difficulty_level
INNER JOIN Hackers AS H ON S.hacker_id = H.hacker_id
WHERE D.score = S.score
GROUP BY S.hacker_id, H.name
HAVING COUNT(S.challenge_id) > 1
ORDER BY COUNT(S.challenge_id) DESC, S.hacker_id ASC;