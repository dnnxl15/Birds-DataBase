PRIMARY KEY (ID_Specie);
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
Alter TABLE Province ADD CONSTRAINT pk_province PRIMARY KEY(ID_Province);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);




/*Primary Key Tabla Amateur*/      
Alter TABLE Amateur ADD CONSTRAINT pk_amateur PRIMARY KEY(username);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);



/*Primary Key Tabla Ornithologhist*/      
Alter TABLE Ornithologhist ADD CONSTRAINT pk_ornithologhist PRIMARY KEY(username);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);




/*Primary Key Tabla Ornithologhist*/      
Alter TABLE Administrator ADD CONSTRAINT pk_administrator PRIMARY KEY(username);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);

/*Primary Key Tabla BirdsByPersonAndLocarion*/      
Alter TABLE BirdsByPersonAndLocation ADD CONSTRAINT pk_username_bbpal PRIMARY KEY(username);
/*
USING INDEX
TABLESPACE ge_ind PCTFREE 20
storage (INITIAL 10K NEXT 10K PCTINCREASE 0);

