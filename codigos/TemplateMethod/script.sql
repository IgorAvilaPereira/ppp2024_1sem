CREATE DATABASE site_tads;

\c site_tads 
 
CREATE TABLE egressos (id serial primary key, nome text, numero_matricula text unique, ano integer check (ano >= 1900), semestre integer check(semestre >= 1 and semestre <= 2));


INSERT INTO egressos (nome, numero_matricula, ano) VALUES
('MARYENE', '2022011031', 2025),
('EMANUELLE', '2022011069', 2025),
('MAICON', '20220110715', 2025);

UPDATE egressos set semestre = 1;

