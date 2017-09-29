CREATE TABLE Bird(   
ID_Bird number(5) CONSTRAINT ID_Bird NOT NULL,   
scientific_name varchar2(100) CONSTRAINT scientific_name_nn NOT NULL ,   
name_bird varchar2(100) CONSTRAINT name_bird_nn NOT NULL,   
size_bird varchar2(100) CONSTRAINT size_nn NOT NULL, 
description varchar2(500) CONSTRAINT description_nn NOT NULL,   
extinction_danger varchar2(1),   
color varchar2(100) CONSTRAINT color_nn NOT NULL
);