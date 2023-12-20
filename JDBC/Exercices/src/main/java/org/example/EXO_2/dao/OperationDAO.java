package org.example.EXO_2.dao;

import org.example.EXO_2.models.Client;
import org.example.EXO_2.models.Operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OperationDAO extends BaseDAO<Operation> {
    public OperationDAO(Connection _connection) {
        super(_connection);
    }

    @Override
    public boolean saveClient(Operation element) throws SQLException {
        return false;
    }

    @Override
    public boolean saveAccount(Operation element) throws SQLException {
        return false;
    }

    @Override
    public boolean deposit(Operation element) throws SQLException {
        return false;
    }

    @Override
    public boolean withdrawal(Operation element) throws SQLException {
        return false;
    }

    @Override
    public Operation getIdClient(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operation> getAllFromAccount() throws SQLException {
        return null;
    }

    @Override
    public List<Operation> getAllClients() throws SQLException {
        return null;
    }

}
