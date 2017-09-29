ALTER TABLE Specie
ADD CONSTRAINT fk_specie_id_gender FOREIGN KEY(ID_Gender) REFERENCES Gender(ID_Gender);

ALTER TABLE Specie
ADD CONSTRAINT fk_specie_id_bird FOREIGN KEY(ID_Bird) REFERENCES Bird(ID_Bird);

ALTER TABLE Gender
ADD CONSTRAINT fk_gender_id_family FOREIGN KEY(ID_Family) REFERENCES Family(ID_Family);

ALTER TABLE Family
ADD CONSTRAINT fk_family_id_suborder FOREIGN KEY(ID_Suborder) REFERENCES Suborder(ID_Suborder);

ALTER TABLE Suborder
ADD CONSTRAINT fk_suborder_id_order FOREIGN KEY(ID_Order) REFERENCES BirdOrder(ID_Order);

--------------------------------------------------------------------------------------------

ALTER TABLE District
ADD CONSTRAINT fk_district FOREIGN KEY(ID_City) REFERENCES City(ID_City);


ALTER TABLE City
ADD CONSTRAINT fk_city FOREIGN KEY(ID_Province) REFERENCES Province(ID_Province);


ALTER TABLE Province
ADD CONSTRAINT fk_province FOREIGN KEY(ID_Country) REFERENCES Country(ID_Country);

ALTER TABLE BirdsByPersonAndLocation
ADD CONSTRAINT fk_id_district_bbpl FOREIGN KEY(ID_District) REFERENCES District(ID_District );

ALTER TABLE BirdsByPersonAndLocation
ADD CONSTRAINT fk_id_bird_bbpl FOREIGN KEY(ID_Bird) REFERENCES Bird(ID_Bird);