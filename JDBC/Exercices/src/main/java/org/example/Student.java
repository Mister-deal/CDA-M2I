package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        try {
            Connection connection = ConnectionUtils.getMysqlConnection();
            if(connection != null){
                System.out.println("connexion ok");
            }else{
                System.out.println("there is a problem with the connexion to the database");
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }
        Scanner scanner =  new Scanner(System.in);
        Connection c = null;
        try{
            c = ConnectionUtils.getMysqlConnection();
            System.out.println("connexion ok");
            System.out.println("Entrez le prénom de l'étudiant :");
            String firstName = scanner.nextLine();
            System.out.println("Entrez le nom de l'étudiant :");
            String lastName = scanner.nextLine();
            System.out.println("Entrez le numéro de classe de l'étudiant :");
            int nbr = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Entrez le diplome de l'étudiant : (format YYYY-MM-DD)");
            String date = scanner.nextLine();


            String request = "INSERT INTO student (first_name, last_name, class_number, diploma_date) VALUES ( ?, ?, ?, ?)";
            PreparedStatement preparedStatement = c.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, nbr);
            preparedStatement.setString(4, date);
            int nbRows = preparedStatement.executeUpdate();
            System.out.println("étudiant ajouté avec succès");
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("nombre de lignes : "+ nbRows);
            if(resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if(c != null){
                try{
                    c.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
