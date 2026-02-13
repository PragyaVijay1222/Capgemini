USE SCOTT;

/*4th maximum salary using co-releatd subquery.*/

SELECT E1.SAL FROM EMP E1 WHERE 3 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL);

/*WAQTD 5th minimum salary.*/

SELECT E1.SAL FROM EMP E1 WHERE 4 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL > E2.SAL);

/*WAQTD details of employee who is earning 7th maximum salary.*/

SELECT E1.* FROM EMP E1 WHERE 6 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL);

/*WAQTD 4th and 5th maximum salary.*/

SELECT E1.SAL FROM EMP E1 WHERE 3 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL) OR 4 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL);
SELECT E1.SAL FROM EMP E1 WHERE (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL) IN (3,4);

/*WAQTD first 5 maximum salaries.*/

SELECT E1.* FROM EMP E1 WHERE (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL) IN (0,1,2,3,4);

/*WAQTD 3rd maximum and 4th minimum salary.*/

SELECT E1.* FROM EMP E1 WHERE 2 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL < E2.SAL) OR 3 IN (SELECT COUNT(DISTINCT E2.SAL) FROM EMP E2 WHERE E1.SAL > E2.SAL); 

/*WAQTD 2nd maximum salary of each dept.*/

SELECT MAX(E1.SAL), E1.DEPTNO FROM EMP E1 WHERE E1.SAL <  (SELECT MAX(E2.SAL) FROM EMP E2 WHERE E1.DEPTNO = E2.DEPTNO) GROUP BY E1.DEPTNO;

/*WAQTD details of employees whose salary is greater than the average salary of the table.*/

SELECT * FROM EMP WHERE SAL > (SELECT AVG(SAL) FROM EMP);

/*WAQTD details of employees whose salary is greater than the average salary of their own department.*/

SELECT * FROM EMP E1 WHERE E1.SAL > (SELECT AVG(E2.SAL) FROM EMP E2 WHERE E1.DEPTNO = E2.DEPTNO GROUP BY E2.DEPTNO); 

/*In-built Functions*/

SELECT SUBSTRING(ENAME, 1, 4) FROM EMP;

/*WAQTD first 3 characters from jobs.*/

SELECT SUBSTRING(JOB, 1, 3) FROM EMP;

/*Waqtd last 3 characters from names.*/

SELECT SUBSTRING(ENAME, LEN(ENAME) - 2, 3) FROM EMP;

/*SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTRING(CITY,LEN(CITY)-1,1) IN ('a', 'e', 'i', 'o', 'u') AND SUBSTRING(CITY, 1,1) IN ('a', 'e', 'i', 'o', 'u'); */

/*WAQTD number of times character 'a' is present in Yashraj string.*/

SELECT LEN('YASHRAJ') - LEN(REPLACE('YASHRAJ','A',''));

/*WAQTD details of employees if they have character 'L' in their name exactly twice.*/

SELECT ENAME FROM EMP WHERE LEN(ENAME) - LEN(REPLACE(ENAME, 'L', '')) = 2;

/*WAQTD total salary of each employees.*/

SELECT SAL, REPLACE(COMM, 'NULL', 0.0), SAL+COMM FROM EMP;