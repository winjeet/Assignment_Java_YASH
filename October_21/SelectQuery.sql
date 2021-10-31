/*1. Retrieve the contact details about employees who belong to department id 10.*/
SELECT e.first_name,e.last_name,e.email,e.phone_number FROM employees e WHERE e.department_id=10;

/*2. Retrieve details of all employees who are earning more than 10000 and whose commission_pct is greater than 0.2*/
SELECT e.employee_id,e.first_name,e.salary,e.commission_pct FROM employees e 
WHERE e.salary>10000 AND e.commission_pct>0.2;

/*3. Retrieve details of all employees who belong to department id either 10 or 20 or 50*/
SELECT e.employee_id,e.department_id from employees e 
WHERE e.department_id IN(10,20,50);

/*4. Search for employees whose name starts with K and ends with n.*/
SELECT e.employee_id,e.first_name,e.last_name FROM employees e
WHERE e.first_name LIKE "K%" AND e.last_name LIKE "%n";

/*5. Search for employees whose last name contains 'oc'*/
SELECT e.employee_id,e.first_name,e.last_name FROM employees e
where e.last_name LIKE "%oc%";

/*6. Search for employees who are not earning commission_pct*/
SELECT e.employee_id,e.first_name,e.commission_pct FROM employees e
where e.commission_pct IS NULL;

/*7. Retrieve all non duplicate manager ids from employees table*/
SELECT DISTINCT e.manager_id FROM employees e;

/*8. Sort the employees record in descending order based on salary. 
If two employees have same salary sorting should be done in ascending order based on last name.*/
SELECT e.employee_id,e.last_name,e.salary FROM employees e
ORDER BY e.salary DESC, e.last_name ASC;

/*9. get all employees who belong  to department 50 and salary is greater than 5000*/
SELECT e.employee_id,e.first_name,e.department_id,e.salary FROM employees e
WHERE e.department_id=50 AND e.salary>5000;

/*10.Get details of all employees who has job id either as SA_REP or SA_MAN*/
SELECT e.employee_id,e.first_name,e.job_id FROM employees e
WHERE e.job_id="SA_REP" OR e.job_id="SA_MAN";