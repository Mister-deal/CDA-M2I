package org.example.controller;

import org.example.dao.SalarieDAO;
import org.example.model.Salarie;

import java.util.List;

public class SalarieController {
    private  SalarieDAO salarieDAO;

    public SalarieController() {
        this.salarieDAO = new SalarieDAO();
    }

    public List<Salarie> getAllSalaries() {
        return salarieDAO.listerSalaries();
    }

   public Salarie getSalarieById(int id) {
        return salarieDAO.getSalarieById(id);
    }

    public void addSalarie(Salarie salarie) {
        salarieDAO.ajouterSalarie(salarie);
    }

    public void updateSalarie(Salarie salarie) {
        salarieDAO.modifierSalarie(salarie);
    }

    public void deleteSalarie(int id) {
        salarieDAO.supprimerSalarie(id);
    }
}
