package org.example.view;

import lombok.Data;
import org.example.controller.DepartementController;
import org.example.controller.SalarieController;
import org.example.dao.DepartementDAO;
import org.example.model.Departement;
import org.example.model.Role;
import org.example.model.Salarie;
import org.example.utils.SalarieTableModel;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


@Data
public class DepartementUI extends JFrame {

    private static DepartementController departementController;
    private static DepartementDAO departementDAO;
    private DefaultListModel<Departement> departementListModel;
    private JList<Departement> departementList;

    private static DepartementUI departementUI;


    public DepartementUI() {
        this.departementController = new DepartementController();
        initializeUI();
    }


    public void initializeUI() {

        // departementController = new DepartementController();
        setTitle("Gestion des Départements");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        departementListModel = new DefaultListModel<>();
        departementList = new JList<>(departementListModel);
        actualiserListeDepartements();

        JButton addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAjoutDialog();
            }
        });

        JButton editButton = new JButton("Modifier");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openModificationDialog();
            }
        });

        JButton deleteButton = new JButton("Supprimer");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               deleteSelectedDepartement();
            }
        });

        JButton salarieButton = new JButton("Salarie");

        salarieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                departementUI.setVisible(false);

            }
        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(salarieButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new JScrollPane(departementList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void actualiserListeDepartements() {
        departementListModel.clear();
        List<Departement> departements = departementController.listerDepartements();
        for (Departement departement : departements) {
            departementListModel.addElement(departement);
        }
    }


    private void openAjoutDialog() {
        // Créer une boîte de dialogue pour l'ajout de salarié
        JDialog ajoutDialog = new JDialog(this, "Ajouter un Departement", true);
        JPanel mainPanel = new JPanel();
        JPanel contentPane = new JPanel();
        ajoutDialog.setBounds(300, 200, 300, 200);
        mainPanel.setLayout(new GridLayout(4, 3));
        ajoutDialog.setLocationRelativeTo(null);
        contentPane.setLayout(new BorderLayout());


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Marges internes


        JLabel nameLabel = new JLabel("Nom:");
        JTextField nameField = new JTextField();
        Dimension textFieldSize = new Dimension(50, 10); // Largeur: 200, Hauteur: 30
        nameField.setPreferredSize(textFieldSize);

        JButton addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = nameField.getText();

                Departement departement = new Departement(nom);
                departementController.ajouterDepartement(departement);

                actualiserListeDepartements();
                ajoutDialog.dispose();
            }
        });

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(new JLabel()); // Placeholder for spacing
        mainPanel.add(addButton);

        contentPane.add(mainPanel, BorderLayout.CENTER);
        ajoutDialog.setContentPane(contentPane);
        ajoutDialog.setVisible(true);
    }

    private void openModificationDialog() {
        int selectedIndex = departementList.getSelectedIndex();
        if (selectedIndex >= 0) {
            Departement selectedDepartement = departementListModel.getElementAt(selectedIndex);

            JDialog modifDialog = new JDialog(this, "Modifier un département", true);
            modifDialog.setSize(300, 200);
            modifDialog.setLayout(new GridLayout(4, 2));
            modifDialog.setLocationRelativeTo(null);

            JLabel nameLabel = new JLabel("Nom:");
            JTextField nameField = new JTextField(selectedDepartement.getNom());

            JButton updateButton = new JButton("Modifier");
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String newName = nameField.getText();
                    selectedDepartement.setNom(newName);

                    departementController.modifierDepartement(selectedDepartement);
                    actualiserListeDepartements();
                    modifDialog.dispose();
                }
            });

            modifDialog.add(nameLabel);
            modifDialog.add(nameField);
            modifDialog.add(new JLabel()); // Placeholder for spacing
            modifDialog.add(updateButton);

            modifDialog.setVisible(true);
        }
    }


    private void deleteSelectedDepartement() {
        int selectedIndex = departementList.getSelectedIndex();
        if (selectedIndex >= 0) {
            Departement selectedDepartement = departementListModel.getElementAt(selectedIndex);

            Departement departementFound = departementController.getDepartementById(selectedDepartement.getId());

            departementController.supprimerDepartement(departementFound);
            departementListModel.removeElement(selectedDepartement);
            updateDepartementList();
        }
    }

    private void updateDepartementList() {
        departementListModel.clear(); // Efface le modèle de liste actuel

        // Ajoutez tous les départements actuels à partir de votre source de données
        List<Departement> allDepartments = departementController.listerDepartements(); // Utilisez votre DepartementDao pour obtenir tous les départements
        for (Departement department : allDepartments) {
            departementListModel.addElement(department);
        }
    }

    public static void main() {

        departementController = new DepartementController();
        departementUI = new DepartementUI();
        departementUI.setVisible(true);


    }
}

