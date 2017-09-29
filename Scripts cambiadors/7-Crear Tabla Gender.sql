CREATE TABLE Gender(   
ID_Gender number(5) CONSTRAINT id_gender_nn NOT NULL,   
ID_Family  number(5) CONSTRAINT gender_id_family_nn NOT NULL, 
name_gender  varchar2(100) CONSTRAINT name_gender_nn NOT NULL
);