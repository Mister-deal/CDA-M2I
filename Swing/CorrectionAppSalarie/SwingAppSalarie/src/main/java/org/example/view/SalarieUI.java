package org.example.view;

import lombok.Data;
import org.example.controller.DepartementController;
import org.example.controller.SalarieController;
import org.example.dao.SalarieDAO;
import org.example.model.Departement;
import org.example.model.Role;
import org.example.model.Salarie;
import org.example.utils.SalarieTableModel;

import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Data
public class SalarieUI {

    private SalarieController salarieController;
    private DepartementController departementController;
    private JFrame frame;
    private JTable salarieTable;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;

    private JButton departementButton;


    public SalarieUI( ) {
        this.salarieController = new SalarieController();
        this.departementController = new DepartementController();
        initializeUI();
    }

    private void initializeUI() {

        frame = new JFrame("Gestion des Salariés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        salarieTable = new JTable();
        refreshTable();

        addButton = new JButton("Ajouter");
        updateButton = new JButton("Modifier");
        deleteButton = new JButton("Supprimer");
        departementButton = new JButton("Departement");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAjoutDialog();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openModificationDialog();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedSalarie();
            }
        });


        departementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DepartementUI.main();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(departementButton);

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(salarieTable), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void refreshTable() {
        List<Salarie> salaries = salarieController.getAllSalaries();
        SalarieTableModel model = new SalarieTableModel((java.util.List<Salarie>) salaries);
        salarieTable.setModel(model);
    }

    private void openAjoutDialog() {
        // Créer une boîte de dialogue pour l'ajout de salarié
        JDialog ajoutDialog = new JDialog(frame, "Ajouter un salarié", true);
        ajoutDialog.setBackground(Color.yellow);
        JPanel mainPanel = new JPanel();
        JPanel contentPane = new JPanel();
        ajoutDialog.setSize(500,200);
        mainPanel.setLayout(new GridLayout(5, 2));

        contentPane.setLayout(new BorderLayout());

        ajoutDialog.setLocationRelativeTo(null);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Marges internes


        JLabel nameLabel = new JLabel("Nom:");
        JTextField nameField = new JTextField();

        JLabel nameLabel1 = new JLabel("Prenom:");
        JTextField nameField1 = new JTextField();


        JLabel roleLabel = new JLabel("Rôle:");
        JRadioButton jRadioButton = new JRadioButton(String.valueOf(Role.MANAGER));
        JRadioButton jRadioButton1 = new JRadioButton(String.valueOf(Role.EMPLOYE));
        JRadioButton jRadioButton2 = new JRadioButton("RH");

        JPanel radioPanel = new JPanel(new GridLayout(1, 3));
        radioPanel.add(jRadioButton);
        radioPanel.add(jRadioButton1);
        radioPanel.add(jRadioButton2);

        JLabel departmentLabel = new JLabel("Département:");
        JComboBox<String> departmentComboBox = new JComboBox<>();

        // Remplir la liste déroulante avec les noms des départements
        List<Departement> departements = departementController.listerDepartements();
        for (Departement department : departements) {
            departmentComboBox.addItem(department.getNom());
        }

       // final String[] selectedRole = {new String()};

        final Role[] roleEnum = new Role[3];
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton.isSelected()) {
                    //selectedRole = jRadioButton.getText();
                    roleEnum[0] = Role.valueOf(jRadioButton.getText());
                }
            }
        });

        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton1.isSelected()) {
                    roleEnum[0] = Role.valueOf(jRadioButton1.getText());

                }
            }
        });

        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton2.isSelected()) {
                    roleEnum[0] = Role.valueOf(jRadioButton2.getText());

                }
            }
        });

        JButton addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = nameField.getText();
                String prenom = nameField1.getText();
                String selectedDepartementName = (String) departmentComboBox.getSelectedItem();
                Departement selectedDepartement = departementController.getDepartementByName(selectedDepartementName);
                Salarie newSalarie = new Salarie(nom,prenom, roleEnum[0], selectedDepartement);
                salarieController.addSalarie(newSalarie);

                refreshTable();
                ajoutDialog.dispose();
            }
        });

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(nameLabel1);
        mainPanel.add(nameField1);
        mainPanel.add(roleLabel);
        mainPanel.add(radioPanel);
        mainPanel.add(departmentLabel);
        mainPanel.add(departmentComboBox);
        mainPanel.add(new JLabel());
        contentPane.add(mainPanel, BorderLayout.CENTER);
        contentPane.add(addButton, BorderLayout.SOUTH);
        ajoutDialog.setContentPane(contentPane);
        ajoutDialog.setVisible(true);
    }


    private void openModificationDialog() {

        int selectedRow = salarieTable.getSelectedRow();

        if (selectedRow >= 0) {

            int salarieId = (int) salarieTable.getValueAt(selectedRow, 0);
            Salarie selectedSalarie = salarieController.getSalarieById(salarieId);

            // Créer une boîte de dialogue pour la modification de salarié
            JDialog modifDialog = new JDialog(frame, "Modifier un salarié", true);
            modifDialog.setSize(300, 200);
            modifDialog.setLayout(new GridLayout(5, 2));
            modifDialog.setLocationRelativeTo(frame);

            JLabel firstnameLabel = new JLabel("Prenom:");
            JTextField firstnameField = new JTextField(selectedSalarie.getPrenom());

            JLabel nameLabel = new JLabel("Nom:");
            JTextField nameField = new JTextField(selectedSalarie.getNom());

            JLabel roleLabel = new JLabel("Rôle:");
            JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"MANAGER", "EMPLOYE", "RH"});
            roleComboBox.setSelectedItem(selectedSalarie.getRole());

            JLabel departmentLabel = new JLabel("Département:");
            JComboBox<String> departmentComboBox = new JComboBox<>();

            // Remplir la liste déroulante avec les noms des départements
            List<Departement> departements = departementController.listerDepartements();
            for (Departement department : departements) {
                departmentComboBox.addItem(department.getNom());
            }
            int departementIndex = departements.indexOf(departements.stream().filter(d -> d.equals(selectedSalarie.getDepartement())).findFirst().get());
            departmentComboBox.setSelectedIndex(departementIndex);

            JButton updateButton = new JButton("Modifier");
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String newName = nameField.getText();
                    String newFirstname= firstnameField.getText();
                    String newRole = (String) roleComboBox.getSelectedItem();
                    String selectedDepartementName = (String) departmentComboBox.getSelectedItem();
                    Departement selectedDepartement = departementController.getDepartementByName(selectedDepartementName);


                    selectedSalarie.setNom(newName);
                    selectedSalarie.setPrenom(newFirstname);
                    selectedSalarie.setRole(Role.valueOf(newRole));
                    selectedSalarie.setDepartement(selectedDepartement);
                    salarieController.updateSalarie(selectedSalarie);

                    refreshTable();
                    modifDialog.dispose();
                }
            });
            modifDialog.add(firstnameLabel);
            modifDialog.add(firstnameField);
            modifDialog.add(nameLabel);
            modifDialog.add(nameField);
            modifDialog.add(roleLabel);
            modifDialog.add(roleComboBox);
            modifDialog.add(departmentLabel);
            modifDialog.add(departmentComboBox);
            modifDialog.add(new JLabel()); // Placeholder for spacing
            modifDialog.add(updateButton);

            modifDialog.setVisible(true);
        }
    }


    private void deleteSelectedSalarie() {
        int selectedRow = salarieTable.getSelectedRow();
        if (selectedRow >= 0) {
            int salarieId = (int) salarieTable.getValueAt(selectedRow, 0);
            salarieController.deleteSalarie(salarieId);
            refreshTable();
        }
    }

   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SalarieController salarieController = new SalarieController(new SalarieDAO()); // Remplacez par le vrai DAO
                new SalarieUI(salarieController);
            }
        });
    }*/
}
