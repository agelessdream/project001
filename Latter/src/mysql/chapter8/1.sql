#1.where子句可否使用组函数进行过滤?
#2.查询公司员工工资的最大值，最小值，平均值，总和
select max(salary),min(salary),avg(salary),sum(salary) from employees;
#3.查询各job_id的员工工资的最大值，最小值，平均值，总和
select job_id,max(salary),min(salary),avg(salary),sum(salary) from employees group by job_id;
#4.选择具有各个job_id的员工人数
select job_id,count(*) from employees group by job_id;
# 5.查询员工最高工资和最低工资的差距（DIFFERENCE）
select max(salary)-min(salary) from employees;
# 6.查询各个管理者手下员工的最低工资，其中最低工资不能低于6000，没有管理者的员工不计算在内
select manager_id,min(salary) m from employees where manager_id is not null group by manager_id having m>=6000;
# 7.查询所有部门的名字，location_id，员工数量和平均工资，并按平均工资降序
select department_name,location_id,count(employee_id),avg(salary) 平均工资
from departments d left join employees e on d.department_id = e.department_id
group by d.department_id
order by 平均工资 desc ;

SELECT department_name, location_id, COUNT(employee_id), AVG(salary) avg_sal
FROM employees e RIGHT JOIN departments d
                            ON e.`department_id` = d.`department_id`
GROUP BY department_name, location_id
ORDER BY avg_sal DESC;
# 8.查询每个工种、每个部门的部门名、工种名和最低工资
select e.job_id,d.department_id,department_name,min(salary)
from employees e right join departments d on d.department_id = e.department_id
group by e.job_id,d.department_id;