package org.example.exercices;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

@Data
public class TaquinWindow {

    private int size = 3; // Taille par défaut du jeu
    private JPanel taquinPanel;

    private JButton startButton;
    private JTextField textField;
    private JLabel headerLabel;
    private FlowLayout flowLayout;
    private JPanel headerPanel;

    private JPanel mainPanel;
    private GridBagLayout gridBagLayout;

    private GridBagConstraints gridBagConstraints;

    private int[] numbers;
    public TaquinWindow() {
        mainPanel = new JPanel(new BorderLayout()); // Utilisation de BorderLayout
        createHeader(); // Crée l'en-tête du jeu
        createTaquin(); // Crée le plateau de jeu
        mainPanel.add(headerPanel, BorderLayout.NORTH); // Ajoute l'en-tête en haut
        mainPanel.add(taquinPanel, BorderLayout.CENTER); // Ajoute le taquin au centre
        mainPanel.setSize(200, 200); // Définit la taille du panneau principal


    }

    private void createHeader() {
        flowLayout = new FlowLayout(); // Crée une disposition de flux
        headerPanel = new JPanel();
        headerPanel.setLayout(flowLayout);
        headerLabel = new JLabel("Taille Jeu"); // Crée une étiquette pour indiquer la taille du jeu
        textField = new JTextField();
        textField.setColumns(4); // Définit le nombre de colonnes du champ de texte
        startButton = new JButton("Démarrer"); // Crée un bouton pour démarrer le jeu
        startButton.addActionListener((e) -> {
            size = Integer.valueOf(textField.getText()); // Récupère la taille entrée par l'utilisateur
            mainPanel.remove(taquinPanel); // Supprime le plateau de jeu actuel
            createTaquin(); // Recrée le plateau de jeu avec la nouvelle taille
            mainPanel.validate(); // Valide le panneau principal pour refléter les changements
        });
        headerPanel.add(headerLabel);
        headerPanel.add(textField);
        headerPanel.add(startButton);
        mainPanel.add(headerPanel);
    }

    private void createTaquin() {
        numbers = new int[(size * size) - 1];
        taquinPanel = new JPanel();
        gridBagLayout = new GridBagLayout();
        taquinPanel.setLayout(gridBagLayout);
        for (int i = 1; i < size * size; i++) {
            numbers[i - 1] = i;
        }
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        shuffle(); // Mélange les nombres pour créer le plateau de jeu
        createButton(); // Crée les boutons du jeu
        mainPanel.add(taquinPanel);
    }

    private void shuffle() {
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int alea = r.nextInt(numbers.length);
            int tmp = numbers[i];
            numbers[i] = numbers[alea];
            numbers[alea] = tmp;
        }
    }

    private void createButton() {
        int x = 0, y = 0;
        for (int n : numbers) {
            JButton b = new JButton(String.valueOf(n)); // Crée un bouton avec le numéro correspondant
            b.addActionListener((e) -> clickButton(e)); // Ajoute un écouteur pour gérer les clics
            gridBagConstraints.gridx = x;
            gridBagConstraints.gridy = y;
            if ((x + 1) % size == 0) { // Détermine quand passer à une nouvelle ligne
                y++;
                x = 0;
            } else {
                x++;
            }
            taquinPanel.add(b, gridBagConstraints); // Ajoute le bouton au plateau de jeu
        }
    }

    private void clickButton(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        int x = gridBagLayout.getConstraints(b).gridx;
        int y = gridBagLayout.getConstraints(b).gridy;
        if (y < size - 1 && emptySpot(x, y + 1)) { // Vérifie si la case vide est en dessous
            moveButton(b, x, y + 1); // Déplace le bouton vers le bas
        } else if (y > 0 && emptySpot(x, y - 1)) { // Vérifie si la case vide est au-dessus
            moveButton(b, x, y - 1); // Déplace le bouton vers le haut
        } else if (x < size - 1 && emptySpot(x + 1, y)) { // Vérifie si la case vide est à droite
            moveButton(b, x + 1, y); // Déplace le bouton vers la droite
        } else if (x > 0 && emptySpot(x - 1, y)) { // Vérifie si la case vide est à gauche
            moveButton(b, x - 1, y); // Déplace le bouton vers la gauche
        }
    }

    private void moveButton(JButton b, int x, int y) {
        // Affiche les coordonnées du déplacement et le texte du bouton
        System.out.println("X : " + x + " Y : " + y + " | " + b.getText());

        // Met à jour les contraintes de la disposition pour déplacer le bouton
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;

        // Applique les nouvelles contraintes au bouton pour le déplacer
        gridBagLayout.setConstraints(b, gridBagConstraints);

        // Rafraîchit le panneau de jeu pour refléter le déplacement du bouton
        taquinPanel.revalidate();
    }


    private boolean emptySpot(int x, int y) {
        // Initialise le résultat à vrai (case vide par défaut)
        boolean result = true;

        // Parcourt tous les composants dans le panneau du taquin
        for (Component c : taquinPanel.getComponents()) {
            // Récupère les coordonnées x et y des contraintes de la disposition du composant
            int xC = gridBagLayout.getConstraints(c).gridx;
            int yC = gridBagLayout.getConstraints(c).gridy;

            // Vérifie si les coordonnées correspondent à celles fournies en arguments
            if (x == xC && y == yC) {
                // S'il y a un composant aux coordonnées fournies, la case n'est pas vide
                result = false;
                // Sort du boucle dès qu'une correspondance est trouvée, puisqu'il n'y a plus de besoin de vérifier
                break;
            }
        }

        // Renvoie le résultat final, vrai si la case est vide, faux sinon
        return result;
    }

}