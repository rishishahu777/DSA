# Write your MySQL query statement below
select w1.id
from Weather as w1
inner join weather as w2 on DATEDIFF(w1.recordDate, w2.recordDate) = 1
where w2.temperature<w1.temperature;