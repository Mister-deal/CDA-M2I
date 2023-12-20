package org.example.EXO_2.service;

import org.example.EXO_2.dao.ClientDAO;
import org.example.EXO_2.models.Client;
import org.example.EXO_2.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClientService {
    private ClientDAO clientDAO;
    private Connection connection;

    public ClientService(){
        try{
            connection = new DatabaseManager().getConnection();
            clientDAO = new ClientDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean createClient(String firstName, String lastName, String telephone){
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setTelephone(telephone);
        try {
            return clientDAO.saveClient(client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Client getPerson(int id){
        try {
            return clientDAO.getIdClient(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Client> getAllClients(){
        try{
            return clientDAO.getAllClients();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
