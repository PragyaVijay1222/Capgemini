USE SCOTT;

/*WAQTD name and hiredate of employees who's name ends with 's' and hired after James.*/

SELECT ENAME, HIREDATE FROM EMP WHERE ENAME LIKE '%S' AND HIREDATE > (SELECT HIREDATE FROM EMP WHERE ENAME = 'JAMES');

/*WAQTD dname of the employee whose name is Miller.*/

SELECT * FROM DEPT;

SELECT DNAME FROM DEPT WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'MILLER');

/*WAQTD details of employees who are working in the ocation New York.*/

SELECT * FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC = 'NEW YORK');

/*WAQTD all the details of employees working in the same designatio as miller and work in location New York.*/

SELECT * FROM EMP WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'MILLER') AND DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC = 'NEW YORK');

/*WAQTD number of employess having job as Clerk, deptno same as Smith, sal more than King, hired afetr Martin and location is Boston.*/

SELECT COUNT(ENAME) FROM EMP WHERE JOB = 'CLERK' AND DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'SMITH') 
AND SAL > (SELECT SAL FROM EMP WHERE ENAME = 'KING') AND HIREDATE > (SELECT HIREDATE FROM EMP WHERE ENAME = 'MARTIN') 
AND DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC = 'BOSTON');

/*WAQTD department name of Clerk.*/

SELECT DNAME FROM DEPT WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE JOB = 'CLERK');

/*WAQTD number of employees working as clerk or salesman earning more than 800 and working in the location of New York or Dallas in each department.*/

SELECT DEPTNO, COUNT(ENAME) FROM EMP WHERE JOB IN ('CLERK', 'SALESMAN') AND SAL > 800 
AND DEPTNO IN (SELECT DEPTNO FROM DEPT WHERE LOC IN ('NEW YORK', 'DALLAS')) GROUP BY DEPTNO;

/*WAQTD details of employee who is earning maximum salary.*/

SELECT * FROM EMP WHERE SAL = (SELECT MAX(SAL) FROM EMP);

/*WAQTD second maximum salary.*/

SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP);

/*WAQTD second minimum salary.*/

SELECT * FROM EMP WHERE  SAL = (SELECT MIN(SAL) FROM EMP WHERE SAL > (SELECT MIN(SAL) FROM EMP));

/*WAQTD loc of employee whi is earning 3rd maximum.*/

SELECT LOC FROM DEPT WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP WHERE SAL < (SELECT MAX(SAL) FROM EMP))));

/*WAQTD name and hiredate of the employee who is earning more than Clerk*/

SELECT ENAME, HIREDATE FROM EMP WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE JOB = 'CLERK');

SELECT ENAME, HIREDATE FROM EMP WHERE SAL > ALL(SELECT SAL FROM EMP WHERE JOB = 'CLERK');

/*WAQTD details of employee who are earning more than salesman but are hired after all the clerks.*/

SELECT * FROM EMP WHERE SAL < ALL(SELECT SAL FROM EMP WHERE JOB = 'SALESMAN') AND HIREDATE > ALL(SELECT HIREDATE FROM EMP WHERE JOB = 'CLERK');

/*WAQTD details of employee who are earning more than anyone with 'a' in their name and less than anyone from Chicago.*/

SELECT * FROM EMP WHERE SAL > ALL(SELECT SAL FROM EMP WHERE ENAME LIKE '%A%') AND SAL < ALL(SELECT SAL FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE LOC = 'CHICAGO'));

/*WAQTD details of employees who earn more than atleast one clerk.*/

SELECT * FROM EMP WHERE SAL > ANY(SELECT SAL FROM EMP WHERE JOB = 'CLERK');

/*WAQTD name, hiredate, annual sal of employees who earn more than any one clerk and are hired after managers.*/

SELECT ENAME, HIREDATE, SAL*12 AS 'annual_sal' FROM EMP WHERE SAL > ANY(SELECT SAL FROM EMP WHERE JOB = 'CLERK') AND HIREDATE > ALL(SELECT HIREDATE FROM EMP WHERE JOB = 'MANAGER');

/*WAQTD names and halfterm salary of employee who is hired afetr Adams and earning less than the employees who is having string 'MAN' in their job and they are hired after atleast a salesman if their salary is in the range 1000 and 5000. */

SELECT ENAME, SAL*6 AS 'HALF_TERM_SAL' FROM EMP WHERE HIREDATE > (SELECT HIREDATE FROM EMP WHERE ENAME = 'ADAMS') AND 
SAL < ALL(SELECT SAL FROM EMP WHERE JOB LIKE '%MAN%') AND HIREDATE > ANY(SELECT HIREDATE FROM EMP WHERE JOB = 'SALESMAN' 
AND SAL BETWEEN 1000 AND 5000);

/*Cross Join*/

SELECT * FROM EMP CROSS JOIN DEPT;

/*Inner Join*/

SELECT *  FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;

/*WAQTD details of employees and their departments if the employees are earning more than 3000.*/

SELECT * FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO WHERE EMP.SAL > 3000;

/*WAQTD details of departments along with the employee names if employees are working in the location of Chicago and they are hired after clerk.*/

SELECT EMP.ENAME, DEPT.* FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO WHERE DEPT.LOC = 'CHICAGO' AND EMP.HIREDATE > ALL(SELECT HIREDATE FROM EMP WHERE JOB = 'CLERK');

/*WAQTD the count of employees per department */

SELECT COUNT(*), EMP.DEPTNO FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO WHERE DEPT.LOC IN ('NEW YORK', 'CHICAGO')
AND EMP.HIREDATE > ALL(SELECT HIREDATE FROM EMP WHERE COMM IS NULL) GROUP BY EMP.DEPTNO HAVING MAX(SAL) > 2000;

/*WAQTD details of Ford's manager.*/

SELECT * FROM EMP WHERE EMPNO = (SELECT MGR FROM EMP WHERE ENAME = 'FORD');

/*WAQTD name and hiredate of Adams' manager.*/

SELECT ENAME, HIREDATE FROM EMP WHERE EMPNO = (SELECT MGR FROM EMP WHERE ENAME = 'ADAMS');

/*WAQTD name and hiredate of Smith's manager's manager.*/

SELECT ENAME, HIREDATE FROM EMP WHERE EMPNO = (SELECT MGR FROM EMP WHERE EMPNO = (SELECT MGR FROM EMP WHERE ENAME = 'SMITH'));

/*WAQTD details of employees reporting to King.*/

SELECT * FROM EMP WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME = 'KING');

/*WAQTD details of employees and their manager details.*/

SELECT * FROM EMP 
