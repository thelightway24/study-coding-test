-- 다음 업그레이드 아이템
SELECT
    i.ITEM_ID, i.ITEM_NAME, i.RARITY
FROM
    ITEM_TREE t
JOIN
    ITEM_INFO i
ON
    i.ITEM_ID = t.ITEM_ID
WHERE
    PARENT_ITEM_ID IN (
    -- 레어 아이템 조회
    SELECT
        ITEM_ID
    FROM ITEM_INFO
    WHERE
        RARITY = 'RARE'
    )
ORDER BY
    ITEM_ID desc