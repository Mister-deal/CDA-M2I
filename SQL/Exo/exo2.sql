CREATE TABLE IF NOT EXISTS compte(
compte_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pseudo VARCHAR(50) NOT NULL,
mot_de_passe VARCHAR(50) NOT NULL,
email VARCHAR(255) NOT NULL,
date_creation DATETIME,
derniere_connexion VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS role(
role_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
libelle VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS compte_role(
compte_id INT NOT NULL,
role_id INT NOT NULL,
date_ajout DATETIME,
CONSTRAINT fk_compte_id FOREIGN KEY (compte_id) REFERENCES compte(compte_id),
CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES role(role_id)
);


