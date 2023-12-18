package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getMysqlConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String user = "root";
        String password = "root";
        Connection c = DriverManager.getConnection(url,user,password);
        return c;
    }
}
