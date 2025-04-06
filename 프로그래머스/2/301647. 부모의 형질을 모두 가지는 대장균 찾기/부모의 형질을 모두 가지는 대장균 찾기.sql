SELECT
    child.ID as ID,
    child.GENOTYPE as GENOTYPE,
    parent.GENOTYPE as PARENT_GENOTYPE
FROM
    ECOLI_DATA parent,
    ecoli_data child
WHERE
    child.PARENT_ID  = parent.ID
AND
    (parent.GENOTYPE & child.GENOTYPE) = parent.GENOTYPE
ORDER BY ID;