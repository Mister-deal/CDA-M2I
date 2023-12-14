-- Créer la BDD
CREATE DATABASE correction_ex_1;

-- Utiliser la BDD
USE correction_ex_1;

-- Question 1 : 
CREATE TABLE personne(
personne_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titre VARCHAR(3) NOT NULL,
prenom VARCHAR(50) NOT NULL,
nom VARCHAR(50) NOT NULL,
telephone VARCHAR(10),
email VARCHAR(150) -- ,
-- CONSTRAINT pk_personne_personne_id PRIMARY KEY (personne_id)
);

-- Question 2
CREATE TABLE adresse (
adresse_id INT NOT NULL AUTO_INCREMENT,
rue VARCHAR(150) NOT NULL,
ville VARCHAR(150) NOT NULL,
code_postal INT NOT NULL,
personne_id INT NOT NULL, 
CONSTRAINT pk_adresse_adresse_id PRIMARY KEY (adresse_id),
CONSTRAINT fk_personne_adresse_personne_id FOREIGN KEY(personne_id) REFERENCES personne(personne_id)
);

-- Affiche le détail des colonnes
SHOW COLUMNS FROM personne;
SHOW COLUMNS FROM adresse;

-- Question 3
INSERT INTO personne (titre,prenom,nom,telephone,email)
VALUES
('Mme','Sandy','Test','0123456789','sandy@test.com'),
('Mr','Patrick','Test','0123456780','patrick@test.com'),
('Mme','Lea','Test','0123456781','lea@test.com'),
('Mr','Ecouteur','Test','0123456782','ecouteur@test.com'),
('Mme','Tata','Test','0123456783','tata@test.com');


SELECT * FROM personne;

INSERT INTO adresse (rue,ville,code_postal,personne_id)
VALUES
('258 boulevard voltaire','Arras',62000,1),
('17 rue dupont','Tourcoing',59200,2),
('17 rue dupont','Roubaix',59100,3),
('17 rue dupont','Lille',59000,1);

SELECT * FROM adresse;

-- Question 4
DELETE FROM adresse WHERE personne_id = 3;

-- Question 5

-- je supprime l'adresse 
DELETE FROM adresse WHERE personne_id = 6;

DELETE FROM personne WHERE prenom = "toto";

-- Question 6
UPDATE personne SET telephone = '9123456789' WHERE nom = "Dupont";
UPDATE personne SET telephone = '9123456789' WHERE nom = "Test";

SELECT * FROM personne ORDER BY nom DESC;
SELECT * FROM personne ORDER BY titre;
SELECT * FROM personne WHERE email = ".com";