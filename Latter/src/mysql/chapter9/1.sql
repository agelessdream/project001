#1.查询和Zlotkey相同部门的员工姓名和工资
select last_name,salary
from employees
where department_id=(select department_id from employees where last_name ='Zlotkey');

#2.查询工资比公司平均工资高的员工的员工号，姓名和工资。
select employee_id,last_name,salary
from employees where salary>(select avg(salary) from employees);

#3.选择工资大于所有JOB_ID = 'SA_MAN'的员工的工资的员工的last_name, job_id, salary
select last_name,job_id,salary from employees where salary>(select max(salary) from employees where job_id='SA_MAN');
select last_name,job_id,salary from employees where salary>all (select salary from employees where job_id='SA_MAN');
#4.查询和姓名中包含字母u的员工在相同部门的员工的员工号和姓名
select last_name,employee_id from employees where department_id in(select department_id from employees where last_name like '%u%');

SELECT employee_id, last_name
FROM employees
WHERE department_id = ANY(
    SELECT DISTINCT department_id
    FROM employees
    WHERE last_name LIKE '%u%'
);
#5.查询在部门的location_id为1700的部门工作的员工的员工号
select employee_id from  employees where department_id in(select department_id from departments where location_id=1700);

SELECT employee_id
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM departments
    WHERE location_id = 1700
)

#6.查询管理者是King的员工姓名和工资
select last_name,salary from employees where manager_id in(select manager_id from employees where last_name='King');
#7.查询工资最低的员工信息: last_name, salary
select last_name,salary from employees where salary=(select min(salary) from employees);
#8.查询平均工资最低的部门信息
select *from departments where department_id in
(select department_id from (select avg(salary)a ,department_id from employees group by department_id order by a limit 1)t1);

#9.查询平均工资最低的部门信息和该部门的平均工资（相关子查询）
select * from
(select avg(salary)a ,department_id from employees group by department_id order by a limit 1)t1
    join departments d on t1.department_id =d.department_id;
#10.查询平均工资最高的 job 信息
#11.查询平均工资高于公司平均工资的部门有哪些?
#12.查询出公司中所有 manager 的详细信息
#13.各个部门中 最高工资中最低的那个部门的 最低工资是多少?
#14.查询平均工资最高的部门的 manager 的详细信息: last_name, department_id, email, salary
#15. 查询部门的部门号，其中不包括job_id是"ST_CLERK"的部门号
#16. 选择所有没有管理者的员工的last_name
#17．查询员工号、姓名、雇用时间、工资，其中员工的管理者为 'De Haan'
#18.查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资（相关子查询）
#19.查询每个部门下的部门人数大于 5 的部门名称（相关子查询）
#20.查询每个国家下的部门个数大于 2 的国家编号（相关子查询）