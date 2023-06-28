# 1.显示所有员工的姓名，部门号和部门名称。
select e.last_name, e.department_id, d.department_name#,count(*)
from employees e
         left join departments d on e.department_id = d.department_id;

select *
from employees e
         left join departments d on e.department_id = d.department_id;

# 2.查询90号部门员工的job_id和90号部门的location_id
select job_id, location_id
from employees
         join departments on employees.department_id = departments.department_id
where departments.department_id = 90;

select job_id, location_id
from employees,
     departments
where employees.department_id = 90
  and departments.department_id = 90;

# 3.选择所有有奖金的员工的 last_name , department_name , location_id , city
select e.last_name, d.department_name, l.location_id, l.city
from employees e
         left join departments d on d.department_id = e.department_id
         left join locations l on d.location_id = l.location_id#第二次为什么也是左连接
where e.commission_pct is not null;

# 4.选择city在Toronto工作的员工的 last_name , job_id , department_id , department_name
select e.last_name, e.job_id, e.department_id, d.department_name
from employees e
         join departments d on e.department_id = d.department_id
         join locations l on d.location_id = l.location_id
where l.city = 'Toronto';#为什么是内连接

# 5.查询员工所在的部门名称、部门地址、姓名、工作、工资，其中员工所在部门的部门名称为’Executive’
select department_name,street_address,last_name,salary,job_title
from employees e join departments d on d.department_id = e.department_id
                join locations l on d.location_id = l.location_id
                join jobs j on e.job_id = j.job_id
where d.department_name='Executive';

# 6.选择指定员工的姓名，员工号，以及他的管理者的姓名和员工号，结果类似于下面的格式
# employees Emp# manager Mgr#
# kochhar 101 king 100
select e1.last_name employees,e1.employee_id "Emp#",e2.last_name manager,e2.employee_id "Mgr#"
from employees e1 left join employees e2 on e1.manager_id=e2.employee_id;
# 7.查询哪些部门没有员工
select d.department_id
from employees e right join departments d on d.department_id = e.department_id
where e.department_id is null;

select department_id
from departments d
where not exists(
    select * from employees e
    where e.department_id=d.department_id
    )
# 8. 查询哪个城市没有部门
select l.city
from locations l left join departments d on l.location_id = d.location_id
where d.location_id is null;

# 9. 查询部门名为 Sales 或 IT 的员工信息
select e.employee_id,e.last_name,d.department_id,d.department_name
from employees e join departments d on d.department_id = e.department_id
where department_name='Sales' or department_name='IT';

SELECT employee_id,last_name,department_name
FROM employees e,departments d
WHERE e.department_id = d.`department_id`
  AND d.`department_name` IN ('Sales','IT');