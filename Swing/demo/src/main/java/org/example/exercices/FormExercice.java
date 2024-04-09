package org.example.exercices;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
@Data
public class FormExercice {

    private JPanel jPanel;
    private JLabel name;
    private JLabel email;

    private JLabel genre;


    private JRadioButton male;
    private JRadioButton female;

    private JTable table;
    JScrollPane scrollPane;

    public FormExercice() {

        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));

        jPanel.add(new JLabel("name:", JLabel.LEFT));
        JTextField inputname = new JTextField(20);
        jPanel.add(inputname);
        jPanel.add(new JLabel("email:", JLabel.LEFT));
        JTextField inputmail = new JTextField(20);
        jPanel.add(inputmail);

        jPanel.add(new JLabel("genre:", JLabel.LEFT));
        jPanel.add(new JRadioButton("male"));
        jPanel.add(new JRadioButton("female"));

        JButton enter = new JButton("ajouter");
        enter.setBackground(Color.white);
        enter.setForeground(Color.black);
        enter.addActionListener(e -> System.out.println("button click"));
        jPanel.add(enter);










    }
}
