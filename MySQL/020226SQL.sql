USE SCOTT;

SELECT * FROM EMP;

/*WAQTD details of the employees who are not earning between 1000 and 3000.*/

SELECT * FROM EMP WHERE SAL NOT BETWEEN 1000 AND 3000;

/*WAQTD ename, sal, hiredate if employee is not hired after 81 but before are 87.*/

SELECT ENAME, SAL, HIREDATE FROM EMP WHERE HIREDATE NOT BETWEEN '1982-01-01' AND '1986-12-31';

/*WAQTD details of employees who are not earning commision.*/

SELECT * FROM EMP WHERE COMM IS NULL;

/*WAQTD details of employees who don't have reporting manager but he is earning more than 3000 and less than 6000.*/

SELECT * FROM EMP WHERE MGR IS NULL AND SAL BETWEEN 3001 AND 5999;

/*WAQTD name of employee who earns commision.*/

SELECT ENAME FROM EMP WHERE COMM IS NOT NULL;

/*WAQTD details of employee who is not earning commision but they have reporting manager.*/

SELECT * FROM EMP WHERE MGR IS NOT NULL AND COMM IS NULL;

/*WAQTD details of employee if they have character 'a' as a first char in their name.*/

SELECT * FROM EMP WHERE ENAME LIKE 'A%';

/*WAQTD details of employee if they have char MAN in their job.*/

SELECT * FROM EMP WHERE JOB LIKE '%MAN%';

/*Display details of employee if ther havce char A or char S in their job and salary starts with 50.*/

SELECT * FROM EMP WHERE (JOB LIKE '%A%' OR JOB LIKE '%S%') AND SAL LIKE '50%';

/*WAQTD details of employee if they are hired in the month of dec.*/

SELECT * FROM EMP WHERE HIREDATE LIKE '____-12-__';

/*Display details of employee if they are hired in the year of 1981 and they are having 4 digit salary*/

SELECT * FROM EMP WHERE HIREDATE LIKE '1981%' AND SAL LIKE '____.__';

/*WAQTD name, annual sal and half term salary with job if the employees are hired after 82 and before 86*/

SELECT ENAME, SAL*6 AS 'half_term_sal', SAL*12 AS 'annual_sal', JOB FROM EMP WHERE (HIREDATE BETWEEN '1983-01-01' AND '1985-12-31')
AND (SAL NOT LIKE '___.__') AND (DEPTNO IN (10,30)) AND (JOB IN ('SALESMAN', 'ANALYST')) AND (MGR IS NOT NULL);

/*WAQTD to concat mr. to employee names.*/

SELECT CONCAT('Mr. ', ENAME) FROM EMP;

/*WAQTD number of employees along with their max sal if they are working in deptno 10 or 30.*/

SELECT COUNT(*), MAX(SAL) FROM EMP WHERE DEPTNO IN (10,30);

/*WAQTD number of employees working in department number 10 if they have reporting manager.*/

SELECT COUNT(*) FROM EMP WHERE DEPTNO = 10 AND MGR IS NOT NULL;

/*WAQTD number of employees working in each dept.*/

SELECT  DEPTNO, COUNT(*) FROM EMP GROUP BY DEPTNO;

/*WAQTD the maximum salary in each department.*/

SELECT DEPTNO, MAX(SAL) FROM EMP GROUP BY DEPTNO;

/*WAQTD number of employees working in each dept if their salary is more than 2000 and they are working as clerk.*/

SELECT DEPTNO, COUNT(*) FROM EMP WHERE SAL > 2000 AND JOB = 'CLERK' GROUP BY DEPTNO;

/*WAQTD unique salaries.*/

SELECT SAL FROM EMP GROUP BY SAL;

/*WAQTD number of times salaries have been repeated in table.*/

SELECT SAL, COUNT(SAL) FROM EMP GROUP BY SAL;

/*WAQTD total salaries of employees working in each job if their job is clerk or salesman and they are hired in the year of 1981.*/

SELECT JOB, SUM(SAL) FROM EMP WHERE JOB IN ('CLERK', 'SALESMAN') AND HIREDATE LIKE '1981%' GROUP BY JOB;

/*WAQTD number of employees working in each department if there are atleast 2 employees working in each dept.*/

SELECT DEPTNO, COUNT(ENAME) FROM EMP GROUP BY DEPTNO HAVING COUNT(ENAME)>=2;

/*WAQTD maximum and minimum salary of employee working in each job if maximum sal of each job is more than 3000.*/

SELECT JOB, MAX(SAL), MIN(SAL) FROM EMP GROUP BY JOB HAVING MAX(SAL) > 3000;

/*WAQTD total salary of employees in each department if their salary is more than 2000 and average salary needed to pay to the employee is less than 2000.*/

SELECT DEPTNO, SUM(SAL) FROM EMP WHERE SAL > 2000 GROUP BY(DEPTNO) HAVING AVG(SAL) < 2000;

/*WAQTD repeated salary.*/

SELECT SAL FROM EMP GROUP BY SAL HAVING COUNT(SAL) >=2;

/*WAQTD maximum salary of employee working in each job if their job is analyst or clerk and their deptno is 20 but their maximum salary is more than 2000 and their salary is more than 1000.*/

SELECT JOB, MAX(SAL) FROM EMP WHERE JOB IN ('CLERK', 'ANALYST') AND DEPTNO = 20 AND SAL > 1000 GROUP BY JOB HAVING MAX(SAL) > 2000;

/*WAQTD details of employees earning more than  SMITH.*/

SELECT *  FROM EMP WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'SMITH');

/*WAQTD name of the employees earning leaa than Jones.*/

SELECT ENAME FROM EMP WHERE SAL < (SELECT SAL FROM EMP WHERE ENAME = 'JONES');

/*WAQTD name of the employees along with annual salary who are hired before James and earning more than 1000.*/

SELECT ENAME, SAL*12 AS 'ANNUAL_SAL' FROM EMP WHERE SAL > 1000 AND HIREDATE < (SELECT HIREDATE FROM EMP WHERE ENAME = 'JAMES');

/*WAQTD name, sal, deptno of the employees who are earning more than 2000 and are in same department as James.*/

SELECT ENAME, SAL, DEPTNO FROM EMP WHERE SAL > 2000 AND DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'JAMES');

/*WAQTD details of employess who earn more than Smith and less than King.*/

SELECT * FROM EMP WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'SMITH') AND SAL < (SELECT SAL FROM EMP WHERE ENAME = 'KING');

/*WAQTD name of employees working in same dept as James, earning more than Adams, working in same dept as Miller and hired after Martin.*/

SELECT ENAME FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'JAMES') AND SAL > (SELECT SAL FROM EMP WHERE ENAME = 'ADAMS') 
AND JOB = (SELECT JOB FROM EMP WHERE ENAME = 'MILLER') AND HIREDATE > (SELECT HIREDATE FROM EMP WHERE ENAME = 'MARTIN');

/**/

