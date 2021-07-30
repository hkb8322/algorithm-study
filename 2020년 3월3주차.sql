/*
 * https://programmers.co.kr/learn/courses/30/lessons/62284
 */

SELECT A.CART_ID FROM 
(
    SELECT CART_ID FROM CART_PRODUCTS
    WHERE NAME = '우유'
) AS A
INNER JOIN 
(
    SELECT CART_ID FROM CART_PRODUCTS
    WHERE NAME = '요거트'
) AS B
ON A.CART_ID = B.CART_ID
GROUP BY A.CART_ID
