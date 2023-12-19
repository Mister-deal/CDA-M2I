package org.example.EXO_2.dao;

import org.example.EXO_2.models.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientDAO extends BaseDAO<Client> {
    public ClientDAO(Connection _connection) {
        super(_connection);
    }

    @Override
    public boolean saveClient(Client element) throws SQLException {
        request = "INSERT INTO client (first_name, last_name, telephone) VALUES(?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getTelephone());
        int rowNb = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()){
            element.setIdentifiant(resultSet.getInt(1));
        }
        return rowNb == 1;
    }

    @Override
    public boolean saveAccount(Client element) throws SQLException {
        return false;
    }

    @Override
    public boolean deposit(Client element) throws SQLException {
        return false;
    }

    @Override
    public boolean withdrawal(Client element) throws SQLException {
        return false;
    }

    @Override
    public Client getIdClient(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Client> getAllFromAccount() throws SQLException {
        return null;
    }



}
