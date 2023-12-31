CREATE TABLE IF NOT EXISTS personne(
personne_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titre VARCHAR(10) NOT NULL,
prenom VARCHAR(30) NOT NULL,
nom VARCHAR(50) NOT NULL,
telephone VARCHAR(10) NOT NULL,
email VARCHAR(254) NOT NULL
);

CREATE TABLE IF NOT EXISTS adresse(
adresse_id INT NOT NULL AUTO_INCREMENT,
rue VARCHAR(255) NOT NULL,
ville VARCHAR(255) NOT NULL,
codePostal INT NOT NULL,
personne_id INT NOT NULL,
PRIMARY KEY(adresse_id),
CONSTRAINT fk_personne_id FOREIGN KEY (personne_id) REFERENCES personne(personne_id)
);

SHOW TABLES;
SHOW COLUMNS FROM personne;
SHOW COLUMNS FROM adresse;
