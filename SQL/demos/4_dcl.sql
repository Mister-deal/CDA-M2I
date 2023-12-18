-- Créer un utilisateur
CREATE USER 'toto'@'localhost' IDENTIFIED BY 'test';
CREATE USER 'titi'@'localhost' IDENTIFIED BY '1234';

-- Donner tous les droits
GRANT ALL PRIVILEGES ON *.* TO 'toto'@'localhost';

-- Voir les privileges
SHOW GRANTS;

-- Donner tous les droits sur une base specifique
GRANT ALL PRIVILEGES ON entreprise_demo.* TO 'titi'@'localhost';

-- Donnes des droit en lecture sur une bdd
GRANT SELECT ON correction_ex_1.adresse TO 'titi'@'localhost';

GRANT INSERT, DELETE ON correction_ex_1.personne TO 'titi'@'localhost';

-- Donne l'acces à la colonne nom et prenom de personne
GRANT SELECT (nom, prenom) ON correction_ex_1.personne TO 'titi'@'localhost';


-- Recharger la table des droits
FLUSH PRIVILEGES; 

SHOW GRANTS FOR 'titi'@'localhost';