package org.example.EXO_2.dao;

import org.example.EXO_2.models.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO<T>{
    protected Connection _connection;
    protected PreparedStatement statement;
    protected String request;
    protected ResultSet resultSet;

    public BaseDAO(Connection _connection) {
        this._connection = _connection;
    }
    public abstract boolean saveClient(T element) throws SQLException;
    public abstract boolean saveAccount(T element) throws SQLException;
    public abstract boolean deposit(T element) throws SQLException;
    public abstract boolean withdrawal(T element) throws SQLException;

    public abstract T getIdClient(int id) throws SQLException;
    public abstract List<T> getAllFromAccount() throws SQLException;
    public abstract List<T> getAllClients() throws  SQLException;

}
