CREATE TABLE BirdsByPersonAndLocation(   
username varchar(100) CONSTRAINT username_bbpl_nn NOT NULL,   
ID_Bird  number(5) CONSTRAINT id_bird_bbpl_nn NOT NULL, 
ID_District number(5) CONSTRAINT id_district_bbpl_nn NOT NULL
);
