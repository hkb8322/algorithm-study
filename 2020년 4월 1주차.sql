/*
 * https://programmers.co.kr/learn/courses/30/lessons/59413
 */

SET @V_HOUR := -1;

SELECT 

    @V_HOUR := @V_HOUR + 1 AS HOUR,
    (
        SELECT
            COUNT(ANIMAL_ID) AS COUNT
        FROM ANIMAL_OUTS
        WHERE HOUR(DATETIME)  = @V_HOUR
    ) AS COUNT
FROM ANIMAL_OUTS
LIMIT 24
