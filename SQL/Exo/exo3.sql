CREATE TABLE professeur (
    id INT PRIMARY KEY,
    prenom VARCHAR(50),
    nom VARCHAR(50),
    numero_classe INT,
    numero_departement INT,
    email VARCHAR(100) UNIQUE,
    telephone VARCHAR(15) UNIQUE
);
CREATE TABLE etudiant (
    id INT PRIMARY KEY,
    prenom VARCHAR(50),
    nom VARCHAR(50),
    telephone VARCHAR(15) NOT NULL,
    numero_classe INT,
    date_obtention_diplome DATE
);
CREATE TABLE association_etudiant_professeur (
    id_etudiant INT,
    id_professeur INT,
    PRIMARY KEY (id_etudiant, id_professeur),
    FOREIGN KEY (id_etudiant) REFERENCES etudiant(id),
    FOREIGN KEY (id_professeur) REFERENCES professeur(id)
);
ALTER TABLE etudiant
ADD CONSTRAINT check_telephone_min_one
CHECK (telephone IS NOT NULL);

ALTER TABLE professeur
ADD CONSTRAINT pk_professeur PRIMARY KEY (id);

ALTER TABLE etudiant
ADD CONSTRAINT pk_etudiant PRIMARY KEY (id);

ALTER TABLE professeur
ADD CONSTRAINT unique_email_professeur UNIQUE (email);

ALTER TABLE professeur
ADD CONSTRAINT unique_telephone_professeur UNIQUE (telephone);

ALTER TABLE etudiant
ADD CONSTRAINT unique_telephone_etudiant UNIQUE (telephone);

-- Exemple d'insertion de données
INSERT INTO professeur VALUES (1, 'Jean', 'Dupont', 101, 201, 'jean.dupont@email.com', '1234567890');

INSERT INTO etudiant VALUES (1, 'Alice', 'Martin', '9876543210', 101, '2022-01-01');

INSERT INTO association_etudiant_professeur VALUES (1, 1);


