package org.example.view.dialog;

import org.example.dao.ContactDao;
import org.example.model.Contact;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateDialog extends JDialog{

    private JPanel contentPanel;

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtNumber;

    public UpdateDialog() {

        contentPanel = new JPanel();
        setTitle("mise à jour contact");
        setBounds(100, 100, 350, 200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        txtId = new JTextField();
        txtId.setBounds(80, 60, 80, 20);
        contentPanel.add(txtId);
        txtId.setColumns(10);

        txtNumber = new JTextField();
        txtNumber.setBounds(80, 40, 80, 20);
        contentPanel.add(txtNumber);
        txtNumber.setColumns(10);

        txtName = new JTextField();
        txtName.setBounds(80, 20, 80, 20);
        contentPanel.add(txtName);
        txtName.setColumns(10);

        JLabel labelId = new JLabel("id");
        labelId.setBounds(10, 10, 50, 15);
        contentPanel.add(labelId);

        JLabel labelName = new JLabel("name");
        labelId.setBounds(10, 10, 50, 15);
        contentPanel.add(labelName);

        JLabel labelNbr = new JLabel("number");
        labelId.setBounds(10, 10, 50, 15);
        contentPanel.add(labelNbr);

        JPanel jPanelButtonRight = new JPanel();
        jPanelButtonRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(jPanelButtonRight, BorderLayout.NORTH);

        JButton jbuttonSearch = new JButton("Search");

        jbuttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contact contact = new Contact();
                contact.setId(Integer.parseInt(txtId.getText()));
            }
        });
        jPanelButtonRight.add(jbuttonSearch);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(jPanel, BorderLayout.SOUTH);

        JButton jButton = new JButton("OK");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contact contact = new Contact();
                contact.setName(txtName.getText());
                contact.setNumber(txtNumber.getText());
                ContactDao contactDao = new ContactDao();
                int count = contactDao.addContact(contact);
                if(count>0){
                    JOptionPane.showConfirmDialog(null, "Operation succeed");
                }else{
                    JOptionPane.showConfirmDialog(null, "Operation Failed");
                }
                dispose();
            }
        });





    }

}

