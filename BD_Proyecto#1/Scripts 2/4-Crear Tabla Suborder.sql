CREATE TABLE Suborder(   
ID_Suborder number(5) CONSTRAINT id_suborder_nn NOT NULL,   
ID_Order  number(5) CONSTRAINT suborder_id_order_nn NOT NULL, 
name_suborder  varchar2(100) CONSTRAINT name_suborder_nn NOT NULL
);
