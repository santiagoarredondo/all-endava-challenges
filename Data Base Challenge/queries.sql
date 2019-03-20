--CREACION DE LA TABALA CHALLENGE
CREATE TABLE CHALLENGE (
SEQ SERIAL,
YN CHAR(1),
AGE SMALLINT,
BIRTHDAY DATE,
BOOL BOOLEAN,
CITY TEXT,
CCNUMBER NUMERIC,
"DATE" DATE ,
DIGIT NUMERIC,
DOLLAR MONEY,
"FIRST" TEXT,
CHIFRE NUMERIC,
NAME TEXT,
"LAST" TEXT,
PARAGRAPH TEXT,
SENTENCE TEXT
);
-- TABLA LOGO
CREATE TABLE LOGO (IMAGE BYTEA);
--INSERTAR LOGO
insert into logo values(bytea('C:\Users\sarredondo\Pictures\foto.jpg'));
--AGREGAR DATOS DE ARCHIVO
copy CHALLENGE from 'C:\Users\sarredondo\Documents\BD Challenge\demofileformated.csv' DELIMITER ',' QUOTE '"' CSV;
--AGREGANDO A CHALLENGE TRGR
ALTER TABLE CHALLENGE ADD COLUMN TRGR BIGINT;
--ACTUALIZANDO TRGR
UPDATE CHALLENGE SET TRGR = SEQ+100;
--CONSULTA EDADES Y CAMPOS YN
SELECT DISTINCT AGE, YN, count(YN) over(partition by age,yn), count(yn) over(partition by age) as total_age, count(YN) over(partition by yn) as total_yn
FROM sq_challenge.CHALLENGE order by age, yn;
-- CREACION DE ESTRUCTURAS PARA ACELERAR LAS CONSULTAS
CREATE INDEX idx_ccnumber
ON sq_challenge.challenge USING btree
(ccnumber ASC NULLS LAST)
TABLESPACE pg_default;
-- CREACION DE TRIGGER Y FUNCION
CREATE FUNCTION sq_challenge.trgr_1()
RETURNS trigger
LANGUAGE 'plpgsql'
NOT LEAKPROOF
AS $BODY$BEGIN
IF NEW.TRGR % 2 = 0 THEN
UPDATE sq_challenge.CHALLENGE SET NEW.TRGR = NEW.TRGR+3;
ELSE
UPDATE sq_challenge.CHALLENGE SET NEW.TRGR = NEW.TRGR-5;
END IF;
END;$BODY$;

ALTER FUNCTION sq_challenge.trgr_1()
OWNER TO postgres;
CREATE TRIGGER trgr_1
BEFORE UPDATE
ON sq_challenge.challenge
FOR EACH ROW
EXECUTE PROCEDURE sq_challenge.trgr_1();
--CONSULTA DE MES DE CUMPLEAÑOS
SELECT to_char(BIRTHDAY,'Month') as birthday_month, to_char("DATE", 'Month') as date_month FROM sq_challenge.CHALLENGE;
-- CONSULTA QUE LISTA LAS TABLAS
command line \d
pgadmin SELECT * FROM pg_catalog.pg_tables WHERE schemaname ='challenge';
-- STORED PROCEDURE CALCULUS
CREATE OR REPLACE PROCEDURE public.calculus()
LANGUAGE 'plpgsql'

AS $BODY$DECLARE
msgErr TEXT;
vn_average numeric;
vn_median numeric;
vn_mode numeric;
BEGIN
vn_average := 0;
vn_median := 0;
vn_mode := 0;
RAISE NOTICE USING message:='AVERAGE;MEDIAN;MODE';

SELECT percentile_disc(0.5) WITHIN GROUP (ORDER BY ccnumber) AS median_value
INTO vn_median
FROM challenge;

SELECT mode() WITHIN GROUP (ORDER BY ccnumber) AS mode_value 
INTO vn_mode
FROM challenge;

SELECT avg(ccnumber) as average_value 
INTO vn_average
FROM challenge;

RAISE NOTICE USING message:= vn_average||';'|| vn_median||';'||vn_mode;
EXCEPTION WHEN OTHERS THEN
get stacked diagnostics msgErr=message_text;
END;$BODY$;
call calculus();