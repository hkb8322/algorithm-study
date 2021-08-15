/*
 * HackerRank - Weather Observation Station 19 (SQL > Advanced Select)
 */

SET @DoctorRow=0, @ProfessorRow=0, @SingerRow=0, @ActorRow=0;

SELECT 
    MIN(COL1),
    MIN(COL2),
    MIN(COL3),
    MIN(COL4)
FROM (
    SELECT
    CASE WHEN Occupation = 'Doctor' THEN Name END AS COL1,
    CASE WHEN Occupation = 'Professor' THEN Name END AS COL2,
    CASE WHEN Occupation = 'Singer' THEN Name END AS COL3,
    CASE WHEN Occupation = 'Actor' THEN Name END AS COL4,
    CASE WHEN Occupation = 'Doctor' THEN @DoctorRow := @DoctorRow + 1
         WHEN Occupation = 'Professor' THEN @ProfessorRow := @ProfessorRow + 1
         WHEN Occupation = 'Singer' THEN @SingerRow := @SingerRow + 1
         WHEN Occupation = 'Actor' THEN @ActorRow := @ActorRow + 1
    END AS ROWNUM
    FROM OCCUPATIONS AS O
    ORDER BY Name ASC
) AS T
GROUP BY ROWNUM;
