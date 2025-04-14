select employees.name,employeeUNI.unique_id
from employees
left join employeeUNI 
on employees.id = employeeUNI.id;