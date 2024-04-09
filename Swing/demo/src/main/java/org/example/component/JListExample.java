package org.example.component;

import lombok.Data;

import javax.swing.*;
import java.awt.*;


public class JListExample extends JFrame{


    public JListExample() {

        String[] listItems = {"Item 1", "Item 2", "Item 3", "Item 4"};

        JList<String> list = new JList<>(listItems);

        JLabel jLabel = new JLabel("Aucun element selectionné");

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedItem = list.getSelectedValue();
                System.out.println(selectedItem);
                jLabel.setText("Element selectionné : " + selectedItem);
            }
        });


        this.getContentPane().add(new JScrollPane(list), BorderLayout.CENTER);
        this.getContentPane().add(jLabel, BorderLayout.SOUTH);

        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            JListExample jListExample = new JListExample();
            jListExample.setVisible(true);

        });



    }



}
