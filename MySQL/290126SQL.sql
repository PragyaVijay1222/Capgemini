/* 29-01-26 */

CREATE DATABASE SCOTT ;
USE SCOTT;

DROP TABLE IF EXISTS emp;
CREATE TABLE emp
(
empno decimal(4,0) NOT NULL,
ename varchar(10) default NULL,
job varchar(9) default NULL,
mgr decimal(4,0) default NULL,
hiredate date default NULL,
sal decimal(7,2) default NULL,
comm decimal(7,2) default NULL,
deptno decimal(2,0) default NULL
);
DROP TABLE IF EXISTS dept;
CREATE TABLE dept (
deptno decimal(2,0) default NULL,
dname varchar(14) default NULL,
loc varchar(13) default NULL
);
INSERT INTO emp VALUES
('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
INSERT INTO emp VALUES
('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
INSERT INTO emp VALUES
('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
INSERT INTO emp VALUES
('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
INSERT INTO emp VALUES
('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
INSERT INTO emp VALUES
('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
INSERT INTO emp VALUES
('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
INSERT INTO emp VALUES
('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
INSERT INTO emp VALUES
('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
INSERT INTO emp VALUES
('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
INSERT INTO emp VALUES
('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
INSERT INTO emp VALUES
('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
INSERT INTO emp VALUES
('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
INSERT INTO emp VALUES
('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');
INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
INSERT INTO dept VALUES ('30','SALES','CHICAGO');
INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');

/*Write a query to display details of employees if their anuual salary is more than 900 and display their half salary.*/

USE SCOTT;
SELECT * FROM EMP;

SELECT *, SAL*6 AS "HALF TERM SALARY" FROM EMP WHERE SAL*12 > 9000;

/*Write a query to display name, job, salary of employees whose job is clerk.*/

SELECT ENAME, JOB, SAL FROM EMP WHERE JOB = 'CLERK';

/*Write a query to display all the details of the employees who are analyst and salary is less than 5000.*/

SELECT * FROM EMP WHERE JOB = 'ANALYST' AND SAL < 5000;

/*Write a query to display all the details nad half term salary of employees who joined after 1980, slaray more than 2000 and is manager.*/

SELECT *, SAL*6 AS "HALF TERM SALARY" FROM EMP WHERE HIREDATE > '1980-12-31' AND SAL > 2000 AND JOB = 'MANAGER'; 

/*Write a query to display all the details of employees who joined on 1980 and half term salary is less than 7000.*/

SELECT * FROM EMP WHERE HIREDATE >= '1980-01-01' AND HIREDATE <= '1980-12-31' AND SAL*6 <7000;

/*Write a query to display all the details of the employees who are Analyst or clerk or salesman.*/

SELECT * FROM EMP WHERE JOB = 'ANALYST' OR JOB = 'CLERK' OR JOB = 'SALESMAN';

/*Write a query to display all the details of the employees who are either analyst or clerk and earn more than 2000.*/

SELECT * FROM EMP WHERE (JOB = 'SALESMAN' OR JOB = 'ANALYST') AND SAL > 2000;

/*Write a query to diaplay all the details of the employees who are either salesman or manager and slary between 2000 and 5000 and are hired after 1982 but before 1987.*/

SELECT * FROM EMP WHERE (JOB = 'SALESMAN' OR JOB = 'MANAGER') AND SAL > 2000 AND SAL <5000 AND HIREDATE > '1982-12-31' AND HIREDATE < '1987-01-01';

/*Write a query to display details of employees who earn more than 2000 but are not manager.*/

SELECT * FROM EMP WHERE NOT JOB = 'MANAGER' AND SAL >2000;

/*Write a query to display details of employees who are neither manager nor salesman and earn less than 15000 yearly.*/

SELECT * FROM EMP WHERE NOT (JOB = 'MANAGER' OR JOB = 'SALESMAN') AND SAL*12 < 15000;

/*Write a query to display details of employees working as analyst or clerk or salesman hired after 1980 in dept no 10, 30.*/

SELECT * FROM EMP WHERE JOB IN ('CLERK', 'ANALYST', 'SALESMAN') AND HIREDATE > '1980-12-31' AND DEPTNO IN (10,30);

/*Write a query to display name, job, hiredate of employees who are hired before 1987 working as clerk or manager but not working in dept no 20, 30.*/

SELECT ENAME, JOB, HIREDATE FROM EMP WHERE JOB IN ('CLERK', 'MANAGER') AND HIREDATE < '1987-01-01' AND DEPTNO NOT IN (20, 30);

/*Write a query to display details of employees along with half term slary if they are earning in the range of 1000 to 5000 but they are not working as salesman or analyst.*/

SELECT *, SAL*6 AS 'HALF TERM SALARY' FROM EMP WHERE JOB NOT IN ('SALESMAN', 'ANALYST') AND SAL BETWEEN 1000 AND 5000;

/*Write a query to display details of employees if they are having salary more than 2000 and less than 6000 and they are hired after 1978 and before 1986.*/

SELECT * FROM EMP WHERE SAL BETWEEN 2001 AND 5999 AND HIREDATE BETWEEN '1979-01-01' AND '1985-12-31';
