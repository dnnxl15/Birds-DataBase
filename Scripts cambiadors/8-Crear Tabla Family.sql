ID_Family number(5) CONSTRAINT id_family_nn NOT NULL,   
ID_Suborder  number(5) CONSTRAINT family_id_suborder_nn NOT NULL, 
name_family  varchar2(100) CONSTRAINT name_family_nn NOT NULL
);
