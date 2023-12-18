CREATE DATABASE transac;

USE transac;

CREATE TABLE utilisateurs(
id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50),
prenom VARCHAR(50),
age INT
);

CREATE TABLE commandes(
id INT AUTO_INCREMENT PRIMARY KEY,
utilisateur_id INT,
produit VARCHAR(50),
quantite INT,
FOREIGN KEY (utilisateur_id) REFERENCES utilisateurs(id)
);

INSERT INTO utilisateurs (nom, prenom, age)
VALUES 
("Doe","John", FLOOR(RAND() * 50) +18),
("Smith","Jahn", FLOOR(RAND() * 50) +18),
("Brown","David", FLOOR(RAND() * 50) +18);

SELECT * FROM utilisateurs;

INSERT INTO commandes (utilisateur_id,produit, quantite)
VALUES
(1,"Produit A",FLOOR(RAND() * 5) +1),
(2,"Produit B",FLOOR(RAND() * 5) +1),
(3,"Produit C",FLOOR(RAND() * 5) +1);

SELECT * FROM commandes;

-- Début de la transaction
-- BEGIN
START TRANSACTION;

-- Inserer un nouvel utilisateur
INSERT INTO utilisateurs (nom, prenom, age)
VALUES 
("All","Good", FLOOR(RAND() * 50) +18);

-- Recup du dernier id utilisateur insere
SET @utilisateur_id = LAST_INSERT_ID();

INSERT INTO commandes (utilisateur_id,produit, quantite)
VALUES
(@utilisateur_id,"Produit A",FLOOR(RAND() * 5) +1);

-- valider ma transaction
COMMIT;

-- Début de la transaction
BEGIN;
-- START TRANSACTION;

-- Inserer un nouvel utilisateur
INSERT INTO utilisateurs (nom, prenom, age)
VALUES 
("NotAll","Good", FLOOR(RAND() * 50) +18);

-- Recup du dernier id utilisateur insere
SET @utilisateur_id = LAST_INSERT_ID();

INSERT INTO commandes (utilisateur_id,produit, quantite)
VALUES
(@utilisateur_id,"Produit B",FLOOR(RAND() * 5) +1);

-- Annuler ma transaction
ROLLBACK;


