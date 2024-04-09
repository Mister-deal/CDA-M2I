package org.example.exercices;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Form2 {

    private JFrame frame;
    private JTable table;

    private JPanel mainPanel;

    private JPanel formPanel;

    private JPanel tablePanel;

    private JPanel contentPane;
    private JSeparator separator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Form2());
    }

    public Form2() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Complex Two Panel Example");
        frame.setBounds(500,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        formPanel = createFormPanel();
        tablePanel = createTablePanel();


        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(separator, BorderLayout.CENTER);
        mainPanel.add(tablePanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }


    private JPanel createFormPanel() {
        JPanel formPanel = new JPanel(new GridBagLayout()); // Crée un panneau avec un gestionnaire de disposition GridBagLayout
        GridBagConstraints constraints = new GridBagConstraints(); // Crée des contraintes pour le placement des composants
        constraints.insets = new Insets(5, 5, 5, 5); // Ajoute des marges autour des composants pour l'apparence

        // Crée les composants du formulaire
        JLabel nameLabel = new JLabel("Nom:");
        JTextField nameTextField = new JTextField(15);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField(15);

        JRadioButton maleRadioButton = new JRadioButton("Homme");
        JRadioButton femaleRadioButton = new JRadioButton("Femme");
        ButtonGroup genderGroup = new ButtonGroup(); // Crée un groupe pour les boutons radio
        genderGroup.add(maleRadioButton); // Ajoute les boutons radio au groupe
        genderGroup.add(femaleRadioButton);

        JButton addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtient les valeurs des champs et du bouton radio sélectionné
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String gender = maleRadioButton.isSelected() ? "Homme" : "Femme";

                // Appelle la méthode pour ajouter les données au tableau
                addToTable(name, email, gender);

                // Efface les champs et désélectionne le bouton radio
                nameTextField.setText("");
                emailTextField.setText("");
                genderGroup.clearSelection();
            }
        });

        // Configuration des contraintes pour chaque composant
        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(nameLabel, constraints);

        constraints.gridx = 1;
        formPanel.add(nameTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(emailLabel, constraints);

        constraints.gridx = 1;
        formPanel.add(emailTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(new JLabel("Genre:"), constraints);

        constraints.gridx = 1;
        formPanel.add(maleRadioButton, constraints);

        constraints.gridx = 2;
        formPanel.add(femaleRadioButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 3; // Le bouton doit occuper toute la largeur
        //constraints.weightx = 3;
        formPanel.add(addButton, constraints);

        TitledBorder formBorder = BorderFactory.createTitledBorder("Formulaire d'ajout"); // Crée une bordure avec un titre
        formPanel.setBorder(formBorder); // Ajoute la bordure au panneau

        return formPanel; // Retourne le panneau de formulaire configuré
    }


    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel(new BorderLayout()); // Crée un panneau avec un layout BorderLayout

        String[] columnNames = {"Nom", "Email", "Genre"}; // Noms des colonnes du tableau
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Crée un modèle de tableau par défaut avec les noms de colonnes
        table = new JTable(tableModel); // Crée une JTable avec le modèle de tableau
        JScrollPane scrollPane = new JScrollPane(table); // Ajoute une barre de défilement à la JTable

        JButton detailsButton = new JButton("Détails"); // Crée un bouton "Détails"
        detailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // Récupère la ligne sélectionnée dans le tableau
                if (selectedRow >= 0) { // Si une ligne est sélectionnée
                    showDetailsDialog(selectedRow); // Affiche une boîte de dialogue avec les détails de la ligne
                } else {
                    // Affiche un avertissement si aucune ligne n'est sélectionnée
                    JOptionPane.showMessageDialog(tablePanel, "Sélectionnez une ligne pour voir les détails.", "Avertissement", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        tablePanel.add(scrollPane, BorderLayout.CENTER); // Ajoute la JTable avec barre de défilement au centre
        tablePanel.add(detailsButton, BorderLayout.SOUTH); // Ajoute le bouton "Détails" en bas

        TitledBorder tableBorder = BorderFactory.createTitledBorder("Tableau des données"); // Crée une bordure avec un titre
        tablePanel.setBorder(tableBorder); // Ajoute la bordure au panneau

        return tablePanel; // Retourne le panneau de tableau configuré
    }


    private void showDetailsDialog(int rowIndex) {
        // Obtient le modèle de tableau associé à la JTable
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        // Récupère les valeurs de la ligne sélectionnée dans la JTable
        String name = (String) tableModel.getValueAt(rowIndex, 0);
        String email = (String) tableModel.getValueAt(rowIndex, 1);
        String gender = (String) tableModel.getValueAt(rowIndex, 2);

        // Crée une boîte de dialogue pour afficher les détails
        JDialog dialog = new JDialog();
        dialog.setTitle("Détails"); // Titre de la boîte de dialogue
        dialog.setModal(true); // Définit la boîte de dialogue comme modale (bloque les interactions avec la fenêtre principale)

        // Crée un panneau pour afficher les détails avec une disposition en grille (3 lignes, 2 colonnes)
        JPanel detailsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Ajoute des marges intérieures

        // Ajoute les étiquettes et les valeurs des détails au panneau
        detailsPanel.add(new JLabel("Nom:"));
        detailsPanel.add(new JLabel(name));

        detailsPanel.add(new JLabel("Email:"));
        detailsPanel.add(new JLabel(email));

        detailsPanel.add(new JLabel("Genre:"));
        detailsPanel.add(new JLabel(gender));

        // Ajoute le panneau de détails à la boîte de dialogue
        dialog.add(detailsPanel);
        dialog.pack(); // Ajuste la taille de la boîte de dialogue en fonction de son contenu
        dialog.setLocationRelativeTo(table); // Centre la boîte de dialogue par rapport à la JTable
        dialog.setVisible(true); // Rend la boîte de dialogue visible
    }


    private void addToTable(String name, String email, String gender) {
        // Obtient le modèle de tableau associé à la JTable
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        // Ajoute une nouvelle ligne avec les valeurs spécifiées au modèle de tableau
        tableModel.addRow(new Object[]{name, email, gender});
    }



}