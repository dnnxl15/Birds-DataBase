CREATE TABLE BirdOrder(   
ID_Order number(5) CONSTRAINT id_order_nn NOT NULL,   
ID_Bird  number(5) CONSTRAINT id_bird_nn NOT NULL, 
name_order  varchar2(100) CONSTRAINT name_order_nn NOT NULL
);

