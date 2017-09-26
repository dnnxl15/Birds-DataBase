/*Primary Key Tabla Bird*/
ALTER TABLE Bird ADD
CONSTRAINT pk_Bird PRIMARY KEY (ID_Bird);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla BirdOrder*/
ALTER TABLE BirdOrder ADD
CONSTRAINT pk_id_order PRIMARY KEY (ID_Order);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Suborder*/
ALTER TABLE Suborder ADD
CONSTRAINT pk_id_suborder PRIMARY KEY (ID_Suborder);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Family*/
ALTER TABLE Family ADD
CONSTRAINT pk_id_family PRIMARY KEY (ID_Family);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Gender*/
ALTER TABLE Gender ADD
CONSTRAINT pk_id_gender PRIMARY KEY (ID_Gender);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Specie*/
ALTER TABLE Specie ADD
CONSTRAINT pk_id_specie PRIMARY KEY (ID_Specie);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Distrito*/
Alter TABLE District
ADD CONSTRAINT pk_district PRIMARY KEY(ID_District);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Ciudad*/      
Alter TABLE City
      ADD CONSTRAINT pk_city PRIMARY KEY(ID_City);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/



/*Primary Key Tabla Pais*/      
Alter TABLE Country
ADD CONSTRAINT pk_country PRIMARY KEY(ID_Country);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
*/
/*------------------------------------------------*/

/



/*Primary Key Tabla Province*/      
Alter TABLE Province      ADD CONSTRAINT pk_province PRIMARY KEY(ID_Province);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);
