package org.example.view;


import org.example.dao.ContactDAO;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JPanel contentPane;


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setTitle("Main Frame");
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public MainFrame() {
        // Configuration de la fermeture de la fenêtre lorsque l'utilisateur clique sur la croix
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Définition de la position et de la taille de la fenêtre
        setBounds(100, 100, 350, 200);

        // Création du panneau principal de la fenêtre
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // Utilisation d'un layout nul (absolu)

        // Bouton "Insert" pour insérer des données dans la base de données
        JButton btnInsert = new JButton("Insert");
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Lorsque le bouton est cliqué, ouvre une boîte de dialogue "InsertDialog"
                InsertDialog dialog = new InsertDialog();
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        btnInsert.setBounds(36, 23, 89, 23);
        contentPane.add(btnInsert);

        // Bouton "Update" pour mettre à jour des données dans la base de données
        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lorsque le bouton est cliqué, ouvre une boîte de dialogue "UpdateDialog"
           UpdateDialog dialog = new UpdateDialog();
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        btnUpdate.setBounds(135, 23, 89, 23);
        contentPane.add(btnUpdate);

        // Bouton "Delete" pour supprimer des données de la base de données
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lorsque le bouton est cliqué, ouvre une boîte de dialogue "DeleteDialog"
                DeleteDialog dialog = new DeleteDialog();
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        btnDelete.setBounds(234, 23, 89, 23);
        contentPane.add(btnDelete);

        // Bouton "Select" pour afficher les données de la base de données dans un tableau
        JButton btnSelect = new JButton("Select");
        btnSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lorsque le bouton est cliqué, exécute une tâche en arrière-plan pour charger les données
                new SwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        // Création d'un modèle de tableau par défaut
                        DefaultTableModel tableModel = new DefaultTableModel();
                        JTable table = new JTable(tableModel);
                        ContactDAO cDAO = new ContactDAO();
                        // Chargement des données à partir de la base de données dans le modèle de tableau
                        cDAO.loadData(tableModel);
                        // Affichage d'une boîte de dialogue avec un défilement pour afficher le tableau
                        JOptionPane.showMessageDialog(null, new JScrollPane(table));
                        return null;
                    }
                }.execute();
            }
        });
        btnSelect.setBounds(135, 57, 89, 23);
        contentPane.add(btnSelect);
    }

}
