# Write your MySQL query statement below
select id,movie,description,round(rating,2) as rating
 from Cinema
where id%2 <> 0 and description <> 'boring'
order by rating desc
