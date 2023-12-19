package org.example.DEMO_DAO.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private final String URL = "jdbc:mysql://localhost:3306/demo_jdbc";
    private final String USER = "root";
    private final String PASSWORD = "root";

        public Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

}
