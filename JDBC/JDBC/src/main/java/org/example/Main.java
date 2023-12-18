package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //connexion à une bdd demo_JDBC mySQL
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";



        try{
            Connection connection = DriverManager.getConnection(url, "root", "root");
            if(connection != null){
                System.out.println("connexion ok");
            }else{
                System.out.println("there is a problem with the connexion to the database");
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }

    }
}