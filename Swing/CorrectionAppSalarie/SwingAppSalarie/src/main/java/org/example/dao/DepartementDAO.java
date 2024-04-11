package org.example.dao;

import org.example.model.Departement;
import org.example.model.Role;
import org.example.model.Salarie;
import org.example.utils.ConnexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartementDAO {
    private Connection connection;

    public DepartementDAO() {
        try {
            connection = ConnexionDB.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Departement getDepartementById(int id) {

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Departement departement = null;

        try {

            String query = "SELECT * FROM departement WHERE id = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                departement = new Departement();
                departement.setId(resultSet.getInt("id"));
                departement.setNom(resultSet.getString("nom"));
                departement.setSalaries(findEmlployeeAllByDepartmentId(id));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departement;
    }

    public Departement getDepartementByName(String name) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Departement departement = null;

        try {

            String query = "SELECT * FROM departement WHERE nom = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                departement = new Departement(id,nom,new ArrayList<>());
                departement.setSalaries(findEmlployeeAllByDepartmentId(id));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departement;
    }
    public void ajouterDepartement(Departement departement) {
        String query = "INSERT INTO departement (nom) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, departement.getNom());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modifierDepartement(Departement departement) {
        String query = "UPDATE departement SET nom = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, departement.getNom());
            preparedStatement.setInt(2, departement.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void supprimerDepartement(int id) {
        String query = "DELETE FROM departement WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Departement> listerDepartements() {
        List<Departement> departements = new ArrayList<>();
        String query = "SELECT * FROM departement";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Departement departement = new Departement();
                departement.setId(resultSet.getInt("id"));
                departement.setNom(resultSet.getString("nom"));
                departement.setSalaries(findEmlployeeAllByDepartmentId(resultSet.getInt("id")));
                departements.add(departement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departements;
    }

    public List<Salarie> findEmlployeeAllByDepartmentId (int id){
        PreparedStatement ps;
        List<Salarie> list = new ArrayList<>();
        ResultSet resultSetEmployee;
        try {
            ps = connection.prepareStatement("SELECT id,prenom,nom,role FROM salarie where departement_id = ?");
            ps.setInt(1,id);
            resultSetEmployee = ps.executeQuery();
            while(resultSetEmployee.next()){
                list.add(new Salarie(resultSetEmployee.getInt("id"),
                        resultSetEmployee.getString("nom"),
                        resultSetEmployee.getString("prenom"),
                        resultSetEmployee.getString("role").equals("MANAGER")? Role.MANAGER :resultSetEmployee.getString("role").equals("EMPLOYEE")? Role.EMPLOYE : Role.RH
                ));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }




}

