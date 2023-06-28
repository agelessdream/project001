#1.所有有门派的人员信息（ A、B两表共有）
select name,deptName from t_emp join t_dept on t_emp.deptId=t_dept.id;
#2.列出所有用户，并显示其机构信息（A的全集）
select name,deptName from t_emp left join t_dept on t_emp.deptId=t_dept.id;
#3.列出所有门派（B的全集）
select deptName from t_dept;
#4.所有不入门派的人员（A的独有）
select name from t_emp left join t_dept on t_emp.deptId=t_dept.id where t_emp.deptId is null;
select name from t_emp where deptId is null;
#5.所有没人入的门派（B的独有）
select*  from t_dept left join t_emp on t_dept.id=t_emp.deptId where t_emp.deptId is null;
#6.列出所有人员和机构的对照关系(AB全有)
SELECT *
FROM t_emp A LEFT JOIN t_dept B
                       ON A.deptId = B.id
UNION
SELECT *
FROM t_emp A RIGHT JOIN t_dept B
                        ON A.deptId = B.id;
#MySQL Full Join的实现 因为MySQL不支持FULL JOIN,下面是替代方法
#left join + union(可去除重复数据)+ right join
#7.列出所有没入派的人员和没人入的门派（A的独有+B的独有）