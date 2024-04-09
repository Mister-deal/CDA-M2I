package org.example.component;

import lombok.Data;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@Data
public class Table {

    JScrollPane scrollPane;
    private JTable tb;


    public Table() {

        String rows[][] = {{"100","Pierre","65000"},{"101","Jean","78000"},{"102","Louis","67000"},{"103","Nassim","00000"},{"104","Alain","89000"}};

        String colum[] = {"ID","NAME","POINTS"};


        tb = new JTable(rows,colum);

        tb.setBounds(30,40,200,200);

        scrollPane = new JScrollPane(tb);
        tb.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = tb.getSelectedRow();

                    if (row < 0) {
                        System.out.println("Il n'y a rien");
                    } else {

                        int modelRow = tb.convertRowIndexToModel(row);

                        System.out.println(String.format("Info selected in: %d. Dans model : %d. Autre info %s, %s, %s", row,
                                modelRow, tb.getModel().getValueAt(modelRow, 0),
                                tb.getModel().getValueAt(modelRow, 1),
                                tb.getModel().getValueAt(modelRow, 2)));

                    }

                }

            }
        });


    }



}
