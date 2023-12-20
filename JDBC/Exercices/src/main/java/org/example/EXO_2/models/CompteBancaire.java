package org.example.EXO_2.models;

import java.util.List;

public class CompteBancaire {

    private int id;
    private int clientId;
    private double solde;
    private Client client;
    private List<Operation> operations;

    public CompteBancaire() {
    }

    public CompteBancaire(int id, int clientId, double solde, Client client, List<Operation> operations) {
        this.id = id;
        this.clientId = client.getIdentifiant();
        this.solde = 0.0;
        this.client = client;
        this.operations = operations;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "id=" + id +
                ", solde=" + solde +
                ", client=" + client +
                ", operations=" + operations +
                '}';
    }
}
