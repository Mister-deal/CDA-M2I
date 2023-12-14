CREATE DATABASE correction_ex_3;

USE correction_ex_3;

-- Question 1 
CREATE TABLE professeur (
professeur_id INT NOT NULL,
prenom VARCHAR(50),
nom VARCHAR(50),
numero_classe INT,
numero_departement INT,
email VARCHAR(250),
telephone VARCHAR(10)
);

-- Question 2 
CREATE TABLE etudiant (
etudiant_id INT NOT NULL,
prenom VARCHAR(50),
nom VARCHAR(50),
numero_classe INT,
telephone VARCHAR(10),
date_diplome DATE
);

-- Question 3
CREATE TABLE professeur_etudiant (
prof_etudiant_id INT NOT NULL AUTO_INCREMENT,
professeur_id INT NOT NULL,
etudiant_id INT NOT NULL,
PRIMARY KEY(prof_etudiant_id),
FOREIGN KEY (professeur_id) REFERENCES professeur(professeur_id),
FOREIGN KEY (etudiant_id) REFERENCES etudiant(etudiant_id)
);

-- Question 4
ALTER TABLE etudiant
MODIFY telephone VARCHAR(10) NOT NULL;

ALTER TABLE etudiant
MODIFY etudiant_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE professeur
MODIFY professeur_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE professeur
ADD CONSTRAINT UC_telephone UNIQUE (telephone);

ALTER TABLE professeur
ADD CONSTRAINT UC_email UNIQUE (email);

ALTER TABLE etudiant
ADD CONSTRAINT UC_telephone UNIQUE (telephone);

-- Question 5
INSERT INTO etudiant (prenom, nom, telephone)
VALUES ('toto','tata','0123456789');

-- Teste valeur unique telephone
INSERT INTO etudiant (prenom, nom, telephone)
VALUES ('toto','tata','0123456789');

-- Teste valeur not null
INSERT INTO etudiant (prenom, nom)
VALUES ('toto','tata');

SELECT * FROM etudiant;

INSERT INTO etudiant (prenom, nom, telephone)
VALUES 
('Sandy','tata','0623456789'),
('Nassim','tata','0123456782'),
('Clement','tata','0123456783'),
('Clemence','tata','0123456781');

INSERT INTO professeur (prenom, nom, telephone,numero_classe,numero_departement)
VALUES 
('Sandy','tata','0623456789',12,405),
('Nassim','tata','0123456782',99,404),
('Clement','tata','0123456783',13,42),
('Clemence','tata','0123456781',59,43);

SELECT * FROM professeur;

INSERT INTO professeur_etudiant(etudiant_id,professeur_id)
VALUES(1,3),(1,3);

INSERT INTO professeur_etudiant(etudiant_id,professeur_id)
VALUES(4,3);

SELECT * FROM professeur_etudiant;

