CREATE DATABASE IF NOT EXISTS demo_jdbc;

USE demo_jdbc;

CREATE TABLE person(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50)
);

CREATE TABLE student(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
class_number INT,
diploma_date VARCHAR(10)
);

SELECT * FROM demo_jdbc.person;
SELECT * FROM demo_jdbc.student;

DROP TABLE person;
DROP TABLE student;