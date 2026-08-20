# Write your MySQL query statement below

select name as customers from Customers where id not in (select customers.id from customers inner join orders on customers.id=orders.customerId order by id);