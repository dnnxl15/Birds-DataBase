CREATE TABLE Specie(   
ID_Specie number(5) CONSTRAINT id_specie_nn NOT NULL,   
ID_Bird  number(5) CONSTRAINT bird_id_specie_nn NOT NULL, 
ID_Gender number(5) CONSTRAINT gender_id_especie_nn NOT NULL,
name_specie  varchar2(100) CONSTRAINT name_specie_nn NOT NULL
);
