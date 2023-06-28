#1. 查询员工的姓名和部门号和年薪，按年薪降序,按姓名升序显示
#2. 选择工资不在 8000 到 17000 的员工的姓名和工资，按工资降序，显示第21到40位置的数据
#3. 查询邮箱中包含 e 的员工信息，并先按邮箱的字节数降序，再按部门号升序
select first_name 姓,last_name 名,department_id 部门号,salary*12 年薪
from employees order by salary*12 desc ,first_name,last_name;

select last_name,salary from employees where salary not between 8000 and 17000 order by salary desc limit 20,20;

select * from employees where email like '%e%' order by length(email)desc,department_id;

select database();