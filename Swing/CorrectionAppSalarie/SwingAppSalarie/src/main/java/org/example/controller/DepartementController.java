package org.example.controller;

import org.example.dao.DepartementDAO;
import org.example.model.Departement;
import org.example.view.DepartementUI;

import java.util.List;


public class DepartementController {
    private DepartementDAO departementDAO;

    public DepartementController() {
        this.departementDAO = new DepartementDAO();
    }

    public List<Departement> listerDepartements() {
        return departementDAO.listerDepartements();
    }

    public Departement getDepartementById(int id) {
        return departementDAO.getDepartementById(id);
    }

    public void ajouterDepartement(Departement departement) {
        departementDAO.ajouterDepartement(departement);
    }

    public Departement getDepartementByName(String name) {
        return departementDAO.getDepartementByName(name);
    }
    public void modifierDepartement(Departement departement) {
        departementDAO.modifierDepartement(departement);
    }

    public void supprimerDepartement(Departement departement) {
     departementDAO.supprimerDepartement(departement.getId());
    }
}

