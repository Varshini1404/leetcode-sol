select Person.firstName,person.lastName,Address.city,Address.state
from Person
LEFT JOIN Address on Person.personId = Address.personId;