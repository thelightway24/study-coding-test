SELECT
    USER_ID, PRODUCT_ID
FROM (
    SELECT
        USER_ID, PRODUCT_ID, count(*) as count
    FROM
        ONLINE_SALE
    GROUP BY
        USER_ID, PRODUCT_ID 
    )
WHERE
    count > 1
ORDER BY
    USER_ID asc,
    PRODUCT_ID desc