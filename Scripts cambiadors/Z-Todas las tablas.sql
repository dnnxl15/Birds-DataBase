/*
CREATE TABLE Person(   
username varchar2(100) CONSTRAINT username_nn NOT NULL,   
password varchar2(100) CONSTRAINT password_nn NOT NULL ,   
firstName varchar2(100) CONSTRAINT first_name_nn NOT NULL, 
lastName varchar2(100) CONSTRAINT last_name_nn NOT NULL,  
gender varchar2(100) CONSTRAINT gender_nn NOT NULL,   
date_of_birth varchar2(100) CONSTRAINT birth_nn NOT NULL,   
profession varchar2(100) CONSTRAINT profession_nn NOT NULL,   
mail varchar2(100) CONSTRAINT mail_nn NOT NULL,  CONSTRAINT mail_unique UNIQUE(mail),
country varchar2(100) CONSTRAINT country_nn NOT NULL 
);

CREATE TABLE Administrator(
username varchar(100)
);

CREATE TABLE Ornithologhist(
username varchar(100)
);

CREATE TABLE Amateur(
username varchar(100)
);



CREATE TABLE Bird(   
ID_Bird number(5) CONSTRAINT ID_Bird NOT NULL,   
scientific_name varchar2(100) CONSTRAINT scientific_name_nn NOT NULL ,   
name_bird varchar2(100) CONSTRAINT name_bird_nn NOT NULL,   
size_bird varchar2(100) CONSTRAINT size_nn NOT NULL, 
description varchar2(500) CONSTRAINT description_nn NOT NULL,   
extinction_danger varchar2(1),   
color varchar2(100) CONSTRAINT color_nn NOT NULL
);


CREATE TABLE Specie(   
ID_Specie number(5) CONSTRAINT id_specie_nn NOT NULL,   
ID_Bird  number(5) CONSTRAINT bird_id_specie_nn NOT NULL, 
ID_Gender number(5) CONSTRAINT gender_id_especie_nn NOT NULL,
name_specie  varchar2(100) CONSTRAINT name_specie_nn NOT NULL
);


CREATE TABLE Gender(   
ID_Gender number(5) CONSTRAINT id_gender_nn NOT NULL,   
ID_Family  number(5) CONSTRAINT gender_id_family_nn NOT NULL, 
name_gender  varchar2(100) CONSTRAINT name_gender_nn NOT NULL
);

CREATE TABLE Family(   
ID_Family number(5) CONSTRAINT id_family_nn NOT NULL,   
ID_Suborder  number(5) CONSTRAINT family_id_suborder_nn NOT NULL, 
name_family  varchar2(100) CONSTRAINT name_family_nn NOT NULL
);

CREATE TABLE Suborder(   
ID_Suborder number(5) CONSTRAINT id_suborder_nn NOT NULL,   
ID_Order  number(5) CONSTRAINT suborder_id_order_nn NOT NULL, 
name_suborder  varchar2(100) CONSTRAINT name_suborder_nn NOT NULL
);


CREATE TABLE BirdOrder(   
ID_Order number(5) CONSTRAINT id_order_nn NOT NULL,   
name_order  varchar2(100) CONSTRAINT name_order_nn NOT NULL
);

CREATE TABLE District(
ID_District NUMBER(6),
ID_City NUMBER(6),
name_district VARCHAR2(100) CONSTRAINT district_namedistrict_nn NOT NULL
);

CREATE TABLE City(
ID_City NUMBER(6),
ID_Province NUMBER(6),
name_city VARCHAR2(100) CONSTRAINT city_namecity_nn NOT NULL
);

CREATE TABLE Province(
ID_Province NUMBER(6),
ID_Country NUMBER(6),
name_province VARCHAR2(100) CONSTRAINT province_nameprovince_nn NOT NULL
);

CREATE TABLE Country(
ID_Country NUMBER(6),
name_country VARCHAR2(100) CONSTRAINT country_namecountry_nn NOT NULL
);

*/ 
