-- 코드를 입력하세요
select left(PRODUCT_CODE, 2) as CATEGORY, count(PRODUCT_ID) as PRODUCTS
from PRODUCT
group by left(PRODUCT_CODE, 2)
order by CATEGORY asc