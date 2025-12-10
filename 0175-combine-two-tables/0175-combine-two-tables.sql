# Write your MySQL query statement below
select firstName, lastName, city, state 
from Person
left join Address
on Person.personId = Address.personId;

-- select FirstName, LastName, City, State
-- from Person left join Address
-- on Person.PersonId = Address.PersonId
-- ;