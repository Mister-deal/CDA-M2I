package org.example.EXO_2.service;

import org.example.EXO_2.dao.CompteBancaireDAO;
import org.example.EXO_2.models.CompteBancaire;
import org.example.EXO_2.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class CompteBancaireService {

    CompteBancaireDAO compteBancaireDAO;

    private Connection connection;

    public CompteBancaireService(){
        try{
            connection = new DatabaseManager().getConnection();
            compteBancaireDAO = new CompteBancaireDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean createAccount(Double solde){
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.setSolde(solde);
        try{
            return compteBancaireDAO.saveAccount(compteBancaire);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
