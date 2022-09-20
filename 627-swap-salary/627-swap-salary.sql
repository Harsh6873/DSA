# Write your MySQL query statement below
update Salary Set sex = Case when sex = 'f' then 'm' else 'f' end
# UPDATE Salary SET sex = CASE WHEN sex='m' THEN 'f' else 'm' end