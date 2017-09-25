CREATE TABLESPACE admi_Data
  DATAFILE 'C:\app\Administrator\oradata\dbProyecto1\admidata01.dbf'
  SIZE 10M
  REUSE
  AUTOEXTEND ON
  NEXT 512k
  MAXSIZE 500M;
--
-- PE: INDEX
--
CREATE TABLESPACE admi_Ind
  DATAFILE 'C:\app\Administrator\oradata\dbProyecto1\admiind01.dbf'
  SIZE 10M
  REUSE
  AUTOEXTEND ON
  NEXT 512k
  MAXSIZE 500M;
