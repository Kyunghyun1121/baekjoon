select  YEAR(YM) as YEAR, round(avg(PM_VAL1), 2) as "PM10", round(avg(PM_VAL2), 2) as "PM2.5"
from AIR_POLLUTION
where LOCATION1 like "경기도" and LOCATION2 like "수원"
group by YEAR(YM)
order by YEAR