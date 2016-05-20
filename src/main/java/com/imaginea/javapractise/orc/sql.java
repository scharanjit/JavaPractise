package orc;

public class sql {

}

/*
 
 
 1.) Find max score without using any predefined function
 
 2.)Find the second highest value
 
 3.)find the employees without manager
 Employees table which contains rows for normal employees as well as managers.
  So, to find out the managers of all the employees, you need a self join.
  
  
SELECT t1.empname [Employee], t2.empname [Manager]
FROM emp t1, emp t2
WHERE t1.mgrid = t2.empid 

Here's an advanced query using a LEFT OUTER JOIN that even returns the employees without managers (super bosses)

SELECT t1.empname [Employee], COALESCE(t2.empname, 'No manager') [Manager]
FROM emp t1
LEFT OUTER JOIN
emp t2
ON
t1.mgrid = t2.empid






Commit and Rollback can be performed after delete statement.
TRUNCATE removes all rows from the table. Truncate operation cannot be rolled back.



.   How to fetch alternate records from a table?
Records can be fetched for both Odd and Even row numbers -.
To display even numbers-.
Select studentId from (Select rowno, studentId from student) where mod(rowno,2)=0   
To display odd numbers-.
Select studentId from (Select rowno, studentId from student) where mod(rowno,2)=1


top 5 names

SELECT  name 
FROM EMPLOYEE o
WHERE (SELECT count(*) FROM EMPLOYEE i WHERE i.name < o.name) < 5


 
 
 select name from employee where (select count(*) from employee where i,name<o.name) <5
 
 
 
 */
