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

public class SalarieDAO {
    private Connection connection;
    private  DepartementDAO departementDAO;

    public SalarieDAO() {
        try {
            connection = ConnexionDB.getConnection();
           departementDAO = new DepartementDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Salarie getSalarieById(int id) {

        String query = "SELECT * FROM salarie WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String role = resultSet.getString("role");
                int departementId = resultSet.getInt("departement_id");

                Departement departement = departementDAO.getDepartementById(departementId);
                Role role1 = Role.valueOf(role);

                // Crée et retourne l'objet Salarie
                Salarie salarie = new Salarie(id, nom, prenom, role1, departement);
                return salarie;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Renvoie null si le salarié n'a pas été trouvé
    }

    public void ajouterSalarie(Salarie salarie) {
        String query = "INSERT INTO salarie (nom, prenom, role, departement_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, salarie.getNom());
            preparedStatement.setString(2, salarie.getPrenom());
            preparedStatement.setString(3, String.valueOf(salarie.getRole()));
            preparedStatement.setInt(4, salarie.getDepartement().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modifierSalarie(Salarie salarie) {
        String query = "UPDATE salarie SET nom = ?, prenom = ?, role = ? ,departement_id = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, salarie.getNom());
            preparedStatement.setString(2, salarie.getPrenom());
            preparedStatement.setString(3, String.valueOf(salarie.getRole()));
            preparedStatement.setInt(4, salarie.getDepartement().getId());
            preparedStatement.setInt(5, salarie.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void supprimerSalarie(int id) {
        String query = "DELETE FROM salarie WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Salarie> listerSalaries() {
        List<Salarie> salaries = new ArrayList<>();
        String query = "SELECT * FROM salarie";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Salarie salarie = new Salarie();
                salarie.setId(resultSet.getInt("id"));
                salarie.setNom(resultSet.getString("nom"));
                salarie.setPrenom(resultSet.getString("prenom"));
                String roleOrdinal = resultSet.getString("role");
                salarie.setRole(Role.valueOf(roleOrdinal));
                int id = resultSet.getInt("departement_id");
                Departement departement = departementDAO.getDepartementById(id);
                // Vous devrez charger le département associé ici
                salarie.setDepartement(departement);
                salaries.add(salarie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salaries;
    }
}

