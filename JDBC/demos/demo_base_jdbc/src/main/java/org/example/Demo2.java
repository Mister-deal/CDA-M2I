package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Test Connection
        /*
        try {
            Connection connection = ConnectionUtils.getMySQLConnection();
            if (connection != null){
                System.out.println("connexion ok !");
            }else {
                System.out.println("connexion nok !!!");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

         */

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");
            /*
            System.out.println("Merci de saisir le prénom : ");
            String firstName = scanner.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String lastName = scanner.nextLine();
            */

            // Une requete pour l'insertion de données
           // String request = "INSERT INTO person (first_name,last_name) VALUES ('"+firstName+"','"+lastName+"')";

            // premiere solution => execution d'une requete sans retour
            /*
            Statement statement = connection.createStatement();
            boolean res = statement.execute(request);
            System.out.println("Requête executée");
            System.out.println(res);

             */

            // deuxieme solution => avec une requete preparee

            // version sans recuperation de l'id
            /*
            String request = "INSERT INTO person (first_name,last_name) VALUES ( ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.execute(); // retour boolean
            int nbRows = preparedStatement.executeUpdate(); // retour int
            System.out.println("Nombre de ligne : "+ nbRows);
            */


            // version avec récuperation de l'id
            /*
            String request = "INSERT INTO person (first_name,last_name) VALUES ( ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            int nbRows = preparedStatement.executeUpdate(); // retour int
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("Nombre de ligne : "+ nbRows);
            if (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
            */


            // Avec une requete de lecture

            String request = "SELECT * FROM person";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+") "+resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
            }


            statement.close();




        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            // Fermer la connexion a la bdd
            if(connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
