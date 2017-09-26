CREATE TABLE Person(   
username varchar2(100) CONSTRAINT username_nn NOT NULL,   
password varchar2(100) CONSTRAINT password_nn NOT NULL ,   
FirstName varchar2(100) CONSTRAINT first_name_nn NOT NULL, LastName varchar2(100) CONSTRAINT last_name_nn NOT NULL,  
gender varchar2(100) CONSTRAINT gender_nn NOT NULL,   
date_of_birth varchar2(100) CONSTRAINT birth_nn NOT NULL,   
profession varchar2(100) CONSTRAINT profession_nn NOT NULL,   
mail varchar2(100) CONSTRAINT mail_nn NOT NULL,  CONSTRAINT mail_unique UNIQUE(mail),
country varchar2(100) CONSTRAINT country_nn NOT NULL 
);
