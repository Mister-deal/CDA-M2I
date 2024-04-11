package org.example;

import org.example.controller.DepartementController;
import org.example.controller.SalarieController;
import org.example.dao.DepartementDAO;
import org.example.dao.SalarieDAO;
import org.example.model.Role;
import org.example.view.DepartementUI;
import org.example.view.SalarieUI;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SalarieUI salarieUI = new SalarieUI();
            }
        });
    }
}
