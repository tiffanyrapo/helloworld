
/**0683**/

假設某關聯資料庫（Relational Database)中有兩個表格（Tables)分別儲存「員工」(Employee)、「部門」(Department)，其Schema如下：
Employee(EID,Name,Sex,BirthYear,Full,Salary,DeptNo)屬性分別代表員工「編號」、「姓名」、「性別」、「出生年」、「專職否」、「薪水」、「所屬部門代號」，而以編號為其主鍵（Primary Key)，
沒有其他候選鍵(Candidate Key)，"Full"的值為字元Y時表示專職，N時表示兼職。

Department(DNo,Name,Area)屬性分別代表部門「代號」、「名稱」、「所在地區」，而以「代號」為其主鍵，沒有其它候選鍵，「名稱」值可能為「生產部」、「行銷部」等中文字串，
「所在地區」值可能為「台北市」、「高雄市」等中文字串。

請寫出下列查詢之SQL：
1.對所有專職人員，請依男女分別列出平均年齡，平均年齡欄位另取名為Average_Year。
2.列出「生產部」的員工中最高與最低薪水的差距，差距欄位去名為Salary_Difference。
3.請列出台北市所有員工清冊，輸出欄位依序為部門名稱、員工編號、姓名、薪水，依照部門代號與員工編號做升冪排序。

A:
1.select avg(BirthYear) as Average_Year from employee where sex = male and full = Y
  select avg(BirthYear) as Average_Year from employee where sex = female and full = Y

2.select max(e.salary) - min(e.salary) as Salary_Difference from employee as e where d.name = "生產部" left join e.deptno = department as d.DNo

3.select d.name, e.eid, e.name, e.salary from employee as e where d.name = "台北市" left join e.deptno = department as d.DNo group by d.dno, e.eid asc
