package org.example.exercices;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

@Data
public class CalculatriceWindow {
    private JPanel calculatricePanel;
    private JLabel blackScreen;
    private GridBagLayout bagLayout;
    private GridBagConstraints bagConstraints;

    private boolean isNewNumber = true;
    private Double oldNumber = null;
    private String lastOperation;

    private String[] buttons = new String[]{"C", "+/-", "%", "/", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "0", ",", "="};


    public CalculatriceWindow() {
        calculatricePanel = new JPanel();
       // calculatricePanel.setSize(600,1200);
        bagLayout = new GridBagLayout();
        calculatricePanel.setLayout(bagLayout);
        bagConstraints = new GridBagConstraints();
        bagConstraints.fill = GridBagConstraints.BOTH;
        createBlackScreen();
        createButton();
    }

    private void createBlackScreen() {
        blackScreen = new JLabel("0"); // Crée un JLabel initialisé avec le texte "0"
        blackScreen.setForeground(Color.WHITE); // Définit la couleur du texte en blanc
        blackScreen.setBackground(Color.BLACK); // Définit la couleur de fond en noir
        blackScreen.setOpaque(true); // Permet au JLabel d'avoir une couleur de fond
        blackScreen.setFont(new Font(null, 0, 30)); // Définit la police du texte avec une taille de 30
        blackScreen.setHorizontalAlignment(SwingConstants.RIGHT); // Aligne le texte à droite
        blackScreen.setVerticalAlignment(SwingConstants.BOTTOM); // Aligne le texte en bas
        bagConstraints.weighty = 1; // Affecte un poids vertical de 1 aux contraintes du GridBagLayout

        bagConstraints.gridwidth = 5; // Définit la largeur occupée par le composant sur 5 cellules
        bagConstraints.gridx = 0; // Position horizontale du composant en x (colonne)
        bagConstraints.gridy = 0; // Position verticale du composant en y (ligne)
        calculatricePanel.add(blackScreen, bagConstraints); // Ajoute le JLabel au panel avec les contraintes
    }


    private void actionButton(ActionEvent e) {
        JButton b = (JButton) e.getSource(); // Récupère le bouton qui a déclenché l'action
        String content = b.getText(); // Récupère le texte du bouton

        try {
            // Si le contenu est une virgule, on l'ajoute au nombre affiché (si une virgule n'est pas déjà présente)
            if (",".equals(content)) {
                if (!blackScreen.getText().contains(",")) {
                    blackScreen.setText(blackScreen.getText() + ",");
                }
                isNewNumber = false;
            } else {
                double number = Double.parseDouble(content.replace(',', '.')); // Remplace la virgule par un point pour la conversion
                // Si un chiffre est pressé
                if (isNewNumber) {
                    blackScreen.setText(content); // Affiche le chiffre sur l'écran
                    isNewNumber = false;
                } else {
                    blackScreen.setText(blackScreen.getText() + content); // Ajoute le chiffre à l'écran
                }
            }
        } catch (NumberFormatException ex) {
            // Si le contenu n'est pas un chiffre ou une virgule, c'est une opération ou autre
            if ("=".equals(content)) {
                // Si le bouton "=" est pressé, effectuer l'opération
                performOperation();
            } else if ("C".equals(content)) {
                // Si le bouton "C" est pressé, réinitialiser la calculatrice
                clear();
            } else {
                // Si c'est une autre opération, stocker l'opération et le nombre précédent
                lastOperation = content;
                oldNumber = Double.valueOf(blackScreen.getText().replace(',', '.'));
                isNewNumber = true;
            }
        }
    }



    private void clear() {
        blackScreen.setText("0");
        isNewNumber = true;
        oldNumber = null;
        lastOperation = "";
    }


    private void performOperation() {
        String text = blackScreen.getText().replace(',', '.');
        double newNumber = 0;
        try {
            newNumber = Double.parseDouble(text);
        } catch (NumberFormatException e) {
            blackScreen.setText("Erreur Format");
            return;
        }
        if (oldNumber != null) {
            switch (lastOperation) {
                case "+":
                    oldNumber = oldNumber + newNumber;
                    break;
                case "-":
                    oldNumber = oldNumber - newNumber;
                    break;
                case "X":
                    oldNumber = oldNumber * newNumber;
                    break;
                case "/":
                    if (newNumber != 0) {
                        oldNumber = oldNumber / newNumber;
                    } else {
                        // Gérer la division par zéro
                        blackScreen.setText("Error");
                        return;
                    }
                    break;
            }

            String result = String.format("%.2f", oldNumber); // Limite à 2 décimales, résultat: "1.67"
            blackScreen.setText(result);

        }
        isNewNumber = true;
    }


    private void createButton() {
        int x = 0; // Initialise la colonne à 0
        int y = 1; // Initialise la ligne à 1

        for (String s : buttons) { // Boucle à travers le tableau de chaînes "buttons"
            JButton button = new JButton(s); // Crée un nouveau bouton avec le texte de la chaîne actuelle "s"
            button.addActionListener((e) -> { // Ajoute un écouteur d'action au bouton
                actionButton(e); // Appelle la méthode "actionButton" lorsque le bouton est cliqué
            });

            // Définit les contraintes pour le placement du bouton dans la grille
            bagConstraints.gridx = x; // Définit la colonne pour le bouton
            bagConstraints.gridy = y; // Définit la ligne pour le bouton
            bagConstraints.weighty = 0.5; // Chaque autre bouton a un poid de 0.5
            if (s.equals("0")) { // Si la chaîne actuelle est "0"
                bagConstraints.gridwidth = 2; // Étend le bouton sur 2 colonnes
                x++; // Incrémente la colonne pour la prochaine position
            } else {
                bagConstraints.gridwidth = 1; // Bouton par défaut sur une colonne
            }

            if ((x + 1) % 4 == 0) { // Si la colonne suivante serait la quatrième colonne (0-indexée)
                button.setBackground(Color.orange); // Définit la couleur de fond du bouton
                button.setOpaque(true); // Définit l'opacité pour rendre la couleur de fond visible
                button.setBorderPainted(false); // Désactive la bordure du bouton
                button.setForeground(Color.WHITE); // Définit la couleur de la police du bouton
                y++; // Passe à la ligne suivante
                x = 0; // Réinitialise la colonne à 0
            } else {
                x++; // Passe à la colonne suivante
            }

            calculatricePanel.add(button, bagConstraints); // Ajoute le bouton au panneau avec les contraintes
        }
    }


}
