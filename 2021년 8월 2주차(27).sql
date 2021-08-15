/*
 * HackerRank - Placements (SQL > Advanced Join)
 */

SELECT
    Students_Salary.Name
FROM ( 
    SELECT 
        S.ID,
        S.Name,
        P.Salary
    FROM Students AS S
    INNER JOIN Packages AS P ON S.ID = P.ID
) AS Students_Salary
INNER JOIN (
    SELECT 
        F.ID,
        P.Salary
    FROM Friends AS F
    INNER JOIN Packages AS P ON F.Friend_ID = P.ID
) AS Friends_Salary ON Students_Salary.ID = Friends_Salary.ID
WHERE Students_Salary.Salary < Friends_Salary.Salary
ORDER BY Friends_Salary.Salary;