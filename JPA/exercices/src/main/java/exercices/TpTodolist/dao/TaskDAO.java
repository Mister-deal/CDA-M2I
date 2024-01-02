package exercices.TpTodolist.dao;

import exercices.TpTodolist.Models.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TaskDAO extends BaseDAO<Task> {
    protected TaskDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean add(Task element) throws SQLException {
        return false;
    }

    @Override
    public Task get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Task> get() throws SQLException {
        return null;
    }

    @Override
    public boolean completed(Task element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Task element) throws SQLException {
        return false;
    }
}
