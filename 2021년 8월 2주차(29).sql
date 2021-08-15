/*
 * HackerRank - Print Prime Numbers (SQL > Alternative Queries)
 */

-- DEFINE PROCEDURE
DELIMITER $$
CREATE PROCEDURE PrintPrimeNum(IN Number INT, OUT Result VARCHAR(16383))
BEGIN
    DECLARE i, j, flag INT;
    SET i := 2;
    SET Result := '';
    
    WHILE i <= Number DO
        SET j := 2;
        SET flag := 0;
        
        WHILE j <= i DO
            IF i % j = 0 THEN
                SET flag := flag + 1;
            END IF;

            SET j := j + 1;
        END WHILE;
        
        IF flag = 1 THEN
            SET Result := CONCAT(Result, i, '&');
        END IF;
        
        SET i := i + 1;
    END WHILE;
    
    SET Result := SUBSTR(Result, 1, LENGTH(Result) - 1);
END $$
DELIMITER ;

-- CALL PROCEDURE
CALL PrintPrimeNum(1000, @v_Result);
SELECT @v_Result;