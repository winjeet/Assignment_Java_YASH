/*1. insert new record in employees table with following details using prepared statement*/
PREPARE insertst FROM 'insert into employees values(?,?,?,?,?,?,?,?,?)';
SET @employee_id = 999;
SET @first_name= 'Rohan';
SET @last_name='SHAH';
SET @email='rohan.shah@hotmail.com';
SET @phone_number=540-835-375;
SET @hire_date='2021-08-02';
SET @job_id="SA_MAN";
SET @salary=45000;
SET @commission_pct=0.2;
SET @manager_id=102;
SET @department_id=10;

EXECUTE insertst USING @employee_id,@first_name,@last_name,@email,@phone_number,
@hire_date,@job_id,@salary,@commission_pct,@manager_id,@department_id;


/*2. delete a record from employees table for following employee_id using prepared statement EMPLOYEE_ID 101*/
PREPARE deletest FROM 'delete from employees where employee_id=?';
SET @employee_id=101;
EXECUTE deletest USING @employee_id;
 
/*3. Update employee email and phonenumber with following details using prepared statement*/
PREPARE updatestmt FROM 'update employees set email=? set phone_number=?';
SET @email='official@yash.com';
SET @phone_number ='789-778-221';
EXECUTE updatestmt USING @email,@phone_number;  

/*4. Create a table States with following columns,
State_Id,State_Name and following records,  S001  Madhya Pradesh S002  Uttar Pradesh
using Replace function insert following entry into state table S001 MadhyaPradesh*/
CREATE TABLE States (State_id varchar(10) PRIMARY KEY, State_name varchar(50));
INSERT INTO States(State_id, State_name) VALUES 
('S001', 'Madhya Pradesh'),('S002', 'Uttar Pradesh');					
REPLACE INTO States VALUES('S001', 'Madhya Pradesh');


/*5. Create a table student with following columns,
   Student_roll_no
   Student_name
   fees
 Update student fees using replace function*/
 
CREATE TABLE Student
(Student_id int,
Student_name varchar(40),
Fees double);

INSERT INTO Student(Student_id, Student_name,Fees) VALUES
(1001, 'Alex Hales', 23000),(1002, 'Sam Billings', 45000);														
REPLACE Student
SET Student_id=1003, Student_name='Jason Roy', Fees=34000;
  


