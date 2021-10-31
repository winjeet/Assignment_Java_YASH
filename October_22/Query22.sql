/*1. Display department_id's of all departments which have number of employees greater than 5.*/
SELECT e.department_id, COUNT(e.employee_id>5)
FROM employees e
GROUP BY e.department_id;

/*2. display department ids whose employees salary average is greater than 20000*/
SELECT e.department_id, AVG(e.salary) AS 'AVG_SALARY' FROM employees e 
HAVING (AVG(e.salary)>20000);

/*3. Display details of  5 employees who are earning highest salary*/
SELECT e.employee_id,e.salary FROM employees e
ORDER BY e.salary DESC LIMIT 5;

/*4. Retrieve department name,city,country name and region name to which employees belong to.*/
SELECT employee_id,department_name,city,country_name,region_name FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
JOIN regions r ON c.region_id = r.region_id;

/*5. Retrieve details of all employees whose commission_pct is greater than commission_pct of employee with last name De Haan.*/
SELECT e.employee_id,e.first_name,e.last_name,e.salary,e.commission_pct FROM employees e
WHERE ifnull(e.commission_pct,0) > 
(SELECT ifnull(em.commission_pct,0) FROM employees em
WHERE em.last_name = 'De Haan'); 

