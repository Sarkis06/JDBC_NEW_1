package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl DaoImpl = new UserDaoJDBCImpl();

    public void createUsersTable() {
        DaoImpl.createUsersTable();
    }

    public void dropUsersTable() {
        DaoImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        DaoImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        DaoImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return DaoImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        DaoImpl.cleanUsersTable();
    }
}
