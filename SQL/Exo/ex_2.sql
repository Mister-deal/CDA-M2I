-- Créer la BDD
CREATE DATABASE correction_ex_2;

-- Utiliser la BDD
USE correction_ex_2;

-- Question 1
CREATE TABLE IF NOT EXISTS compte(
compte_id INT NOT NULL AUTO_INCREMENT,
pseudo VARCHAR(50),
mot_de_passe VARCHAR(50),
email VARCHAR(255),
date_creation DATETIME,
derniere_connexion VARCHAR(50),
PRIMARY KEY(compte_id)
);

-- Question 2
CREATE TABLE IF NOT EXISTS role(
role_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
libelle VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS compte_role(
compte_id INT NOT NULL,
role_id INT NOT NULL,
date_ajout DATETIME DEFAULT NOW(),
PRIMARY KEY (compte_id,role_id),
FOREIGN KEY(compte_id) REFERENCES compte(compte_id),
FOREIGN KEY(role_id) REFERENCES role(role_id)
);

