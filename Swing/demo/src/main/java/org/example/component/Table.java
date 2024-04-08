package org.example.component;

import lombok.Data;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
@Data
public class Table {

    private JScrollPane scrollPane;
    private JTable tb;

    public Table() {

        String rows[][] = {{"100", "pierre", "65000"}, {"101", "jean", "78000"}, {"102", "Louis", "67000"}, {"103", "Nassim", "00000"}, {"104", "Alain", "89000"}};

        String column[] = {"ID", "NAME", "POINTS"};

        tb = new JTable(rows, column);

        tb.setBounds(30, 40, 500, 500);

        JScrollPane scrollPane = new JScrollPane(tb);

        tb.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                int row = tb.getSelectedRow();

                if(row<0){
                    System.out.println("il n'y a rien");
                }else {

                    int modelRow = tb.convertRowIndexToModel(row);

                    System.out.println(String.format("Info selected in: %d. autre info %s, %s, %s", row));
                }
            }
        });
    }
}
