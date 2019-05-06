
/**0683**/

假設某關聯資料庫（Relational Database)中有兩個表格（Tables)分別儲存「員工」(Employee)、「部門」(Department)，其Schema如下：
Employee(EID,Name,Sex,BirthYear,Full,Salary,DeptNo)屬性分別代表員工「編號」、「姓名」、「性別」、「出生年」、「專職否」、「薪水」、「所屬部門代號」，而以編號為其主鍵（Primary Key)，
沒有其他候選鍵(Candidate Key)，"Full"的值為字元Y時表示專職，N時表示兼職。

Department(DNo,Name,Area)屬性分別代表部門「代號」、「名稱」、「所在地區」，而以「代號」為其主鍵，沒有其它候選鍵，「名稱」值可能為「生產部」、「行銷部」等中文字串，
「所在地區」值可能為「台北市」、「高雄市」等中文字串。

請寫出下列查詢之SQL：
1.對所有專職人員，請依男女分別列出平均年齡，平均年齡欄位另取名為Average_Year。
2.列出「生產部」的員工中最高與最低薪水的差距，差距欄位名為Salary_Difference。
3.請列出台北市所有員工清冊，輸出欄位依序為部門名稱、員工編號、姓名、薪水，依照部門代號與員工編號做升冪排序。

A:
1.select avg(BirthYear) as Average_Year from employee where sex = 'male' and full = 'Y';
  select avg(BirthYear) as Average_Year from employee where sex = 'female' and full = 'Y';

2.select max(EMPLOYEE .salary) - min(EMPLOYEE .salary) as Salary_Difference from EMPLOYEE inner join DEPARTMENT on EMPLOYEE.DEPTNO = DEPARTMENT.DNO
  where DEPARTMENT.NAME  = '生產部' ;

3.select DEPARTMENT .name, EMPLOYEE .eid, EMPLOYEE .name, EMPLOYEE .salary from employee left join department on EMPLOYEE .deptno = DEPARTMENT .DNO
  where DEPARTMENT .area = '台北市' order by DEPARTMENT .DNO , EMPLOYEE .eid asc;



create table employee (eid int not null ,name VARCHAR(255) ,sex CHAR(10) ,birthyear int,fulljob char(10) ,salary int, deptno int,
 primary key (eid));
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (001,'tom','female',1978,'Y',32510,01);
insert into employee(eid, name, sex, birthyear, fulljob,salary, deptno) VALUES (002,'tim','male',1998,'Y',28510,02);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (003,'tony','male',1988,'Y',47510,03);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (004,'candy','female',1987,'Y',22510,03);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (005,'kim','female',1988,'Y',32510,04);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (006,'cloud','male',1981,'Y',32510,01);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (007,'awei','male',1928,'Y',36510,02);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (008,'iris','female',1978,'Y',30510,03);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (009,'sara','female',1986,'Y',34510,01);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (010,'eddie','male',1984,'Y',54710,03);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (011,'tom','male',1983,'Y',64710,04);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (012,'vera','female',1981,'Y',34710,01);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (013,'ted','female',1978,'F',54710,02);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (014,'vicky','male',1998,'Y',77710,01);
insert into employee(eid, name, sex, birthyear, fulljob, salary, deptno) VALUES (015,'meng','female',1968,'F',22710,03);

create table department(dno int, name VARCHAR(255) ,area VARCHAR(255) ,primary key (dno));
insert into department(dno, name, area) values (01,'業務部','台中市');
insert into department(dno, name, area) values (02,'行政部','新竹市');
insert into department(dno, name, area) values (03,'生產部','台北市');
insert into department(dno, name, area) values (04,'後勤部','基隆市');