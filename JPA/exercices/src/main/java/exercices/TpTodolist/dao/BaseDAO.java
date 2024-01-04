package exercices.TpTodolist.dao;

import exercices.TpTodolist.Models.Task;
import exercices.TpTodolist.Models.TaskInfo;

import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO {

    public abstract boolean add(Task task) throws SQLException;
    public abstract List<Task> get() throws SQLException;
    public abstract boolean completed(Long taskId) throws SQLException;
    public abstract boolean delete(Long taskId) throws SQLException;


}
