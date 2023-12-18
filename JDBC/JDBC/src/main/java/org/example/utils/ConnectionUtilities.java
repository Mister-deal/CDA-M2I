package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtilities {
    public static Connection getMysqlConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String username = "root";
        String password =  "root";
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
}
