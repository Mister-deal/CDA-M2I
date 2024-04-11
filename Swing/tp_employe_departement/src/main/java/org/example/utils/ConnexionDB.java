package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String database = "cruddbswing";
            String URL = "jdbc:mysql://localhost:3306/";
            Connection con = DriverManager.getConnection(URL + database, "admin", "root");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }


    }
}
