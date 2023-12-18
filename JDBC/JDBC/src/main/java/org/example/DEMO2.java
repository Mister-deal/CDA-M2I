package org.example;

import org.example.utils.ConnectionUtilities;

import java.sql.*;
import java.util.Scanner;

public class DEMO2 {
    public static void main(String[] args){
        //test connexion

        try {
            Connection connection = ConnectionUtilities.getMysqlConnection();
            if(connection != null){
                System.out.println("connexion ok");
            }else{
                System.out.println("there is a problem with the connexion to the database");
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }

        Scanner s = new Scanner(System.in);
        Connection c = null;
        try{
            c = ConnectionUtilities.getMysqlConnection();
            System.out.println("connexion ok");
            System.out.println("merci de saisir le prénom :");
            String firstName = s.nextLine();
            System.out.println("merci de saisir votre nom de famille :");
            String lastName = s.nextLine();
            //requete d'insertion de données
           /*
           String request = "INSERT INTO person (first_name, last_name) VALUES ('"+firstName+"','"+lastName+"')";

            //premiere solution => execution d'une requête sans retour

            Statement statement = c.createStatement();
            boolean res = statement.execute(request);
            System.out.println("requête executée");
            System.out.println(res);


            */

            //execution d'une requête préparée
            //version sans récupération de l'id
            /*
            String request = "INSERT INTO person (first_name, last_name) VALUES (?, ?)";
            PreparedStatement preparedStatement = c.prepareStatement(request);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.execute(); //retour boolean
            int nbRows = preparedStatement.executeUpdate(); //retour int
            System.out.println("Nombre de lignes :"+ nbRows);
             */

            // version avec récupération de l'id
            /*
            String request = "INSERT INTO person (first_name, last_name) VALUES ( ?, ?)";
            PreparedStatement preparedStatement  = c.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            int nbRows = preparedStatement.executeUpdate(); //retour int
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("Nombre de lignes : "+ nbRows);
            if(resultSet.next()){
                System.out.println( resultSet.getInt(1));
            }
            */
            //Avec une requete de lecture

            String request = "SELECT * FROM person";
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+" , "+resultSet.getString("first_name")+" "+resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            // fermer la connexion à la bdd
            if(c != null){
                try {
                    c.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
