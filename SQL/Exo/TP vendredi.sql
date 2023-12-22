-- Données pour le TP : TableTopTreasures

-- Attention, ce fichier n'a pour vocation que de stocker des données au format SQL. 
-- Il n'est pas fonctionnel en l'état

-- Categories
('Stratégie'),
('Familial'),
('Aventure');

-- Jeux de Société
('Catan', 'Jeu de stratégie et de développement de colonies', 30, 1),
('Dixit', 'Jeu d''association d''images', 25, 2),
('Les Aventuriers', 'Jeu de plateau d''aventure', 40, 3),
('Carcassonne', 'Jeu de placement de tuiles', 28, 1),
('Codenames', 'Jeu de mots et d''indices', 20, 2),
('Pandemic', 'Jeu de coopération pour sauver le monde', 35, 3),
('7 Wonders', 'Jeu de cartes et de civilisations', 29, 1),
('Splendor', 'Jeu de développement économique', 27, 2),
('Horreur à Arkham', 'Jeu d''enquête et d''horreur', 45, 3),
('Risk', 'Jeu de conquête mondiale', 22, 1),
('Citadelles', 'Jeu de rôles et de bluff', 23, 2),
('Terraforming Mars', 'Jeu de stratégie de colonisation de Mars', 55, 3),
('Small World', 'Jeu de civilisations fantastiques', 32, 1),
('7 Wonders Duel', 'Jeu de cartes pour 2 joueurs', 26, 2),
('Horreur à l''Outreterre', 'Jeu d''aventure horrifique', 38, 3);

-- Clients

('Dubois', 'Marie', 'marie.dubois@example.com', '123 Rue de la Libération, Ville', '+1234567890'),
('Lefebvre', 'Thomas', 'thomas.lefebvre@example.com', '456 Avenue des Roses, Ville', '+9876543210'),
('Martinez', 'Léa', 'lea.martinez@example.com', '789 Boulevard de la Paix, Ville', '+2345678901'),
('Dupuis', 'Antoine', 'antoine.dupuis@example.com', '567 Avenue de la Liberté, Ville', '+3456789012'),
('Morin', 'Camille', 'camille.morin@example.com', '890 Rue de l''Avenir, Ville', '+4567890123'),
('Girard', 'Lucas', 'lucas.girard@example.com', '234 Avenue des Champs, Ville', '+5678901234'),
('Petit', 'Emma', 'emma.petit@example.com', '123 Rue des Étoiles, Ville', '+6789012345'),
('Sanchez', 'Gabriel', 'gabriel.sanchez@example.com', '345 Boulevard du Bonheur, Ville', '+7890123456'),
('Rossi', 'Clara', 'clara.rossi@example.com', '678 Avenue de la Joie, Ville', '+8901234567'),
('Lemoine', 'Hugo', 'hugo.lemoine@example.com', '456 Rue de la Nature, Ville', '+9012345678'),
('Moreau', 'Eva', 'eva.moreau@example.com', '789 Avenue de la Créativité, Ville', '+1234567890'),
('Fournier', 'Noah', 'noah.fournier@example.com', '234 Rue de la Découverte, Ville', '+2345678901'),
('Leroy', 'Léa', 'lea.leroy@example.com', '567 Avenue de l''Imagination, Ville', '+3456789012'),
('Robin', 'Lucas', 'lucas.robin@example.com', '890 Rue de la Création, Ville', '+4567890123'),
('Marchand', 'Anna', 'anna.marchand@example.com', '123 Boulevard de l''Innovation, Ville', '+5678901234');




-- Question 1
CREATE DATABASE tabletoptreasures_database;

USE tabletoptreasures_database;

-- Queestion 2
CREATE TABLE Clients (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(50) NOT NULL,
    Prenom VARCHAR(50) NOT NULL,
    Adresse_mail VARCHAR(150) NOT NULL,
    Adresse_de_livraison VARCHAR(150),
    Telephone VARCHAR(11)
);
CREATE TABLE Categories (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(10) NOT NULL
);
CREATE TABLE Jeux (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(30) NOT NULL,
    Description VARCHAR(500),
    Prix INT NOT NULL,
    ID_Categorie INT NOT NULL,
    FOREIGN KEY (ID_Categorie)
        REFERENCES Categories (ID)
);
CREATE TABLE Commandes (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    ID_Client INT NOT NULL,
    Date_de_commande DATE NOT NULL,
    Adresse_de_livraison VARCHAR(150) NOT NULL,
    Statut VARCHAR(50),
    FOREIGN KEY (ID_Client)
        REFERENCES Clients (ID)
);

USE tabletoptreasures_database;
-- Question 1
-- Données pour le TP : TableTopTreasures
-- Categories
INSERT INTO categories (Nom)
VALUES
('Stratégie'),
('Familial'),
('Aventure');

-- Jeux de Société
INSERT INTO jeux (Nom, Description, Prix, ID_Categorie)
VALUES
('Catan', 'Jeu de stratégie et de développement de colonies', 30, 1),
('Dixit', 'Jeu d''association d''images', 25, 2),
('Les Aventuriers', 'Jeu de plateau d''aventure', 40, 3),
('Carcassonne', 'Jeu de placement de tuiles', 28, 1),
('Codenames', 'Jeu de mots et d''indices', 20, 2),
('Pandemic', 'Jeu de coopération pour sauver le monde', 35, 3),
('7 Wonders', 'Jeu de cartes et de civilisations', 29, 1),
('Splendor', 'Jeu de développement économique', 27, 2),
('Horreur à Arkham', 'Jeu d''enquête et d''horreur', 45, 3),
('Risk', 'Jeu de conquête mondiale', 22, 1),
('Citadelles', 'Jeu de rôles et de bluff', 23, 2),
('Terraforming Mars', 'Jeu de stratégie de colonisation de Mars', 55, 3),
('Small World', 'Jeu de civilisations fantastiques', 32, 1),
('7 Wonders Duel', 'Jeu de cartes pour 2 joueurs', 26, 2),
('Horreur à l''Outreterre', 'Jeu d''aventure horrifique', 38, 3);

-- Clients
INSERT INTO clients (Nom, Prenom, Adresse_mail, Adresse_de_livraison, Telephone)
VALUES
('Dubois', 'Marie', 'marie.dubois@example.com', '123 Rue de la Libération, Ville', '+1234567890'),
('Lefebvre', 'Thomas', 'thomas.lefebvre@example.com', '456 Avenue des Roses, Ville', '+9876543210'),
('Martinez', 'Léa', 'lea.martinez@example.com', '789 Boulevard de la Paix, Ville', '+2345678901'),
('Dupuis', 'Antoine', 'antoine.dupuis@example.com', '567 Avenue de la Liberté, Ville', '+3456789012'),
('Morin', 'Camille', 'camille.morin@example.com', '890 Rue de l''Avenir, Ville', '+4567890123'),
('Girard', 'Lucas', 'lucas.girard@example.com', '234 Avenue des Champs, Ville', '+5678901234'),
('Petit', 'Emma', 'emma.petit@example.com', '123 Rue des Étoiles, Ville', '+6789012345'),
('Sanchez', 'Gabriel', 'gabriel.sanchez@example.com', '345 Boulevard du Bonheur, Ville', '+7890123456'),
('Rossi', 'Clara', 'clara.rossi@example.com', '678 Avenue de la Joie, Ville', '+8901234567'),
('Lemoine', 'Hugo', 'hugo.lemoine@example.com', '456 Rue de la Nature, Ville', '+9012345678'),
('Moreau', 'Eva', 'eva.moreau@example.com', '789 Avenue de la Créativité, Ville', '+1234567890'),
('Fournier', 'Noah', 'noah.fournier@example.com', '234 Rue de la Découverte, Ville', '+2345678901'),
('Leroy', 'Léa', 'lea.leroy@example.com', '567 Avenue de l''Imagination, Ville', '+3456789012'),
('Robin', 'Lucas', 'lucas.robin@example.com', '890 Rue de la Création, Ville', '+4567890123'),
('Marchand', 'Anna', 'anna.marchand@example.com', '123 Boulevard de l''Innovation, Ville', '+5678901234');

-- Question 2
INSERT INTO commandes (ID_Client, Date_de_commande, Adresse_de_livraison, Statut)
VALUES
		(1, '2023-12-15', '123 Rue de la Libération, Ville', "Livree"),
		(2, '2023-12-15', '456 Avenue des Roses, Ville', "En cours"),
		(3, '2023-12-15', '789 Boulevard de la Paix, Ville', "Annulee");

-- Question 3
SELECT * FROM jeux WHERE ID = 3;
UPDATE
	jeux
SET
	Prix = 35
WHERE ID = 3;
SELECT * FROM jeux WHERE ID = 3;

-- Question 4
SELECT * FROM jeux WHERE ID = 2;
DELETE FROM jeux WHERE ID = 2;
SELECT * FROM jeux WHERE ID = 2;

SELECT * FROM jeux WHERE Prix = (SELECT min(Prix) FROM jeux);

-- Question 6
SELECT sum(Prix) AS 'Somme totale des prix de tous les jeux' FROM jeux;

-- Question 7
SELECT * FROM jeux ORDER BY Nom LIMIT 5;


-- Clients
-- Question 1
SELECT DISTINCT Prenom AS "noms de clients distincts"FROM clients;

-- Question 2
SELECT * FROM clients WHERE Adresse_de_livraison LIKE "%Rue%" AND Telephone LIKE "+1%";

-- Question 3
SELECT * FROM clients WHERE nom LIKE "M%" OR nom LIKE "R%";

-- Question 4
SELECT count(*) AS "Nombre de clients avec adresse mail valide" FROM clients WHERE Adresse_mail LIKE "%@%";

-- Question 5
SELECT Prenom FROM clients WHERE length(prenom) = (SELECT MIN(length(prenom)) FROM clients);

-- Question 6
SELECT count(*) AS "Nombre de clients enregistres" FROM clients;
