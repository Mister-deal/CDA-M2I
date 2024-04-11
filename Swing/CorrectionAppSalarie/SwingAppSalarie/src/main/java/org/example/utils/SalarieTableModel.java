package org.example.utils;

import org.example.model.Salarie;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SalarieTableModel extends AbstractTableModel {
    private List<Salarie> salarieList;
    private String[] columnNames = {"ID", "Nom","Prenom","Rôle"};

    public SalarieTableModel(List<Salarie> salarieList) {

        this.salarieList = salarieList;
    }

    @Override
    public int getRowCount() {
        return salarieList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Salarie salarie = salarieList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return salarie.getId();
            case 1:
                return salarie.getNom();
            case 2:
                return salarie.getPrenom();
            case 3:
                return salarie.getRole();
            default:
                return null;
        }
    }
}
