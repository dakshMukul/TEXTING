create database hibernate_crud;
use hibernate_crud;

create table student(name varchar(25),email varchar(30),id int);
insert into student values('Mukul','dakshmukul15@gmail.com',1);

delete from student where id != 1;
ALTER TABLE student MODIFY COLUMN id INT auto_increment