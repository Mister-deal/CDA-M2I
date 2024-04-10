CREATE DATABASE IF NOT EXISTS cruddbdemo;

USE cruddbdemo;

CREATE TABLE contacts (
    id INT PRIMARY KEY auto_increment,
    name VARCHAR(255),
    number VARCHAR(20)
);
