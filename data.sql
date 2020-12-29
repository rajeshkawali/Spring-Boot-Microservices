CREATE DATABASE company;
USE company;
--CREATE TABLE department (department_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, department_name VARCHAR(100), department_address VARCHAR(100));
INSERT INTO `department` (`department_id`,`department_address`,`department_name`) VALUES (1,'Mumbai','Software');
INSERT INTO `department` (`department_id`,`department_address`,`department_name`) VALUES (2,'USA','HR');
INSERT INTO `department` (`department_id`,`department_address`,`department_name`) VALUES (3,'India','Tester');
--SELECT * FROM department;


--CREATE TABLE employee (employee_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, full_name VARCHAR(100), department_id INT);
INSERT INTO `employee` (`employee_id`,`department_id`,`full_name`) VALUES (1,1,'Rajesh Kawali');
INSERT INTO `employee` (`employee_id`,`department_id`,`full_name`) VALUES (2,2,'Mahesh Koli');
INSERT INTO `employee` (`employee_id`,`department_id`,`full_name`) VALUES (3,3,'Chandrashekhar Reddy');
--SELECT * FROM employee;