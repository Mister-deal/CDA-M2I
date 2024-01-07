package exercices.TpTodolist.dao;

import exercices.TpTodolist.Models.User;

import java.util.List;

public interface InterfaceUser {
    public void addUser(User user);

    public void deleteUser(Long id);

    public List<User> getAllUsers();
}
