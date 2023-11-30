package org.example.exercices.poo_exo_exceptions;

public class Exo4 {
    private double solde;

    public Exo4(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) throws SoldeInsuffisantException{
        if(montant > solde){
            throw new SoldeInsuffisantException("solde insuffisant");
        } else {
            solde -= montant;
            System.out.println("retrait de " + montant + " effectué");
        }
    }
    public String afficherSolde(){
        return "le solde est de : " + solde;
    }
}
