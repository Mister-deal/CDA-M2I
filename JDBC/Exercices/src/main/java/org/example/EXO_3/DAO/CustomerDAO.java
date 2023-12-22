package org.example.EXO_3.DAO;

import jdk.jshell.spi.ExecutionControl;
import org.example.EXO_3.Models.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerDAO extends BaseDAO<Customer> {

    protected CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Customer element) throws SQLException, ExecutionControl.NotImplementedException {
        return false;
    }

    @Override
    public boolean update(Customer element) throws SQLException, ExecutionControl.NotImplementedException {
        return false;
    }

    @Override
    public boolean delete(Customer element) throws SQLException, ExecutionControl.NotImplementedException {
        return false;
    }

    @Override
    public Customer get(int id) throws SQLException, ExecutionControl.NotImplementedException {
        return null;
    }

    @Override
    public List<Customer> get() throws SQLException, ExecutionControl.NotImplementedException {
        return null;
    }
}
