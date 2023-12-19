package org.example.EXO_2.dao;

import org.example.EXO_2.models.Client;
import org.example.EXO_2.models.CompteBancaire;

import java.sql.*;
import java.util.List;

public class CompteBancaireDAO extends BaseDAO<CompteBancaire> {

    private ClientDAO clientDAO;
    public CompteBancaireDAO(Connection _connection) {
        super(_connection);
    }

    @Override
    public boolean saveClient(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public boolean saveAccount(CompteBancaire element) throws SQLException {
        request = "INSERT INTO compteBancaire (solde, client_identifiant) VALUES(?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSolde());
        statement.setInt(2, element.getClientId());
        int rowNb = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return rowNb == 1;
    }

    @Override
    public boolean deposit(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public boolean withdrawal(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public CompteBancaire getIdClient(int id) throws SQLException {
        CompteBancaire compteBancaire = null;
        String request = "SELECT * FROM compteBancaire WHERE client_identifiant = ?";

        try (PreparedStatement statement = _connection.prepareStatement(request)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    compteBancaire = new CompteBancaire();
                    compteBancaire.setId(resultSet.getInt("id"));
                    compteBancaire.setSolde(resultSet.getDouble("solde"));
                    // Autres propriétés du compte bancaire à récupérer...

                    // Vous pouvez également définir le client identifiant si nécessaire
                    compteBancaire.setClientId(resultSet.getInt("client_identifiant"));
                }
            }
        }

        return compteBancaire;
    }


    @Override
    public List<CompteBancaire> getAllFromAccount() throws SQLException {
        return null;
    }

}
