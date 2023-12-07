package org.example.exercice4;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirerArgent(double montant) throws SoldeInsuffisantException {
        if(montant > solde){
            throw new SoldeInsuffisantException();
        }else {
            solde -= montant;
        }
    }

    public double getSolde(){
        return solde;
    }
}
