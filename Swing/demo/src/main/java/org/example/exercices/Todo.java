package org.example.exercices;

import javax.swing .*;
import javax.swing.border.EmptyBorder;
import java.awt .*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Todo extends JFrame {
    private DefaultListModel<String> model;
    private JList<String> todoList;
    private JTextField inputField;
    private JButton addButton;
    private JButton deleteButton;
    private JButton completeButton;

    public Todo() {
        setTitle("To-Do List App"); // Définit le titre de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Définit l'action de fermeture lors de la fermeture de la fenêtre
        setSize(400, 500); // Définit la taille de la fenêtre
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran
        setLayout(new BorderLayout()); // Utilise la disposition BorderLayout pour le contenu de la fenêtre
        getContentPane().setBackground(new Color(240, 240, 240)); // Définit la couleur de fond de la fenêtre

        model = new DefaultListModel<>(); // Crée un modèle par défaut pour la liste
        todoList = new JList<>(model); // Crée une JList en utilisant le modèle
       todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Définit le mode de sélection de la liste
        JScrollPane scrollPane = new JScrollPane(todoList); // Ajoute la liste à un panneau déroulant
        add(scrollPane, BorderLayout.CENTER); // Ajoute le panneau déroulant au centre de la fenêtre

        inputField = new JTextField(); // Crée un champ de saisie
        inputField.setBorder(new EmptyBorder(5, 10, 5, 10)); // Ajoute des marges intérieures au champ de saisie
        add(inputField, BorderLayout.NORTH); // Ajoute le champ de saisie en haut de la fenêtre

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Crée un panneau pour les boutons avec une disposition FlowLayout
        buttonPanel.setBackground(Color.DARK_GRAY); // Définit la couleur de fond du panneau de boutons

        addButton = new JButton("Add"); // Crée un bouton avec le texte "Add"
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Administrateur\\Downloads\\add.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); // Charge une icône pour le bouton (remplacez le chemin par le chemin de votre icône)
        addButton.setIcon(imageIcon); // Définit l'icône pour le bouton "Add"

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = inputField.getText(); // Récupère le texte saisi dans le champ de saisie
                if (!item.isEmpty()) { // Si le champ n'est pas vide
                    model.addElement(item); // Ajoute l'élément au modèle de liste
                    inputField.setText(""); // Efface le contenu du champ de saisie
                }
            }
        });

        buttonPanel.add(addButton); // Ajoute le bouton "Add" au panneau de boutons


        // Bouton pour supprimer la tâche completée ou pas.
        deleteButton = new JButton("Delete"); // Crée un bouton avec le texte "Delete"

        // Charge l'icône à partir d'un fichier (remplacez le chemin par le chemin de votre icône)
        ImageIcon imageIconDelete = new ImageIcon((new ImageIcon("C:\\Users\\Administrateur\\Downloads\\delete.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        deleteButton.setIcon(imageIconDelete); // Définit l'icône pour le bouton "Delete"
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = todoList.getSelectedIndex(); // Récupère l'index de l'élément sélectionné dans la liste
                if (selectedIndex != -1) { // Si un élément est sélectionné
                    model.remove(selectedIndex); // Supprime l'élément sélectionné du modèle de liste
                }
            }
        });
        buttonPanel.add(deleteButton); // Ajoute le bouton "Delete" au panneau de boutons


        // Bouton pour indiquer que la tâche est completée.
        completeButton = new JButton("Complete"); // Crée un bouton avec le texte "Complete"

        // Charge l'icône à partir d'un fichier (remplacez le chemin par le chemin de votre icône)
        ImageIcon imageIconComplete = new ImageIcon((new ImageIcon("C:\\Users\\Administrateur\\Downloads\\complete.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        completeButton.setIcon(imageIconComplete); // Définit l'icône pour le bouton
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = todoList.getSelectedIndex(); // Récupère l'index de l'élément sélectionné dans la liste
                String selectedTask = model.getElementAt(selectedIndex); // Récupère la tâche sélectionnée dans le modèle
                if (selectedTask.startsWith("<html><strike>")) {
                    selectedTask = selectedTask.replaceAll("<html><strike>", "").replaceAll("</strike></html>", "");
                } else {
                    selectedTask = "<html><strike>" + selectedTask + "</strike></html>"; // Ajoute ou enlève la balise <strike> pour marquer/démarquer la tâche comme complétée
                }
                model.setElementAt(selectedTask, selectedIndex); // Met à jour la tâche dans le modèle

            }
        });
        buttonPanel.add(completeButton); // Ajoute le bouton "Complete" au panneau de boutons

        add(buttonPanel, BorderLayout.SOUTH); // Ajoute le panneau de boutons en bas du panneau principal

// Ajoute un écouteur de souris à la liste
        todoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Si un double-clic est effectué
                    completeButton.doClick(); // Effectue un clic programmé sur le bouton "Complete"
                }
            }
        });

        setVisible(true); // Rend le composant (dans ce cas, probablement une JFrame) visible

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Todo());
    }
}
