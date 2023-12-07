package org.example.classes;

public class Facture {

    private static int NB_MAX_LIGNES = 10;

    private static int numeroCourant = 0;

    private String client, date;

    private Ligne[] lignes;

    private int nbLignes = 0;

    private int numero = 0;

    public Facture(String client, String date, int nbLignes) {
        this.client = client;
        this.date = date;
        this.lignes = new Ligne[nbLignes];
        numero = ++numeroCourant;
    }

    public Facture(String client, String date) {
       this(client,date,NB_MAX_LIGNES);
    }

    public void ajouterLigne(String referenceArticle, int quantite){
        lignes[nbLignes++] = new Ligne(Article.getArticle(referenceArticle),quantite);
    }

    public double getPrixTotal(){
        double pt = 0;
        for (int i = 0; i < nbLignes; i++ ){
            pt += lignes[i].prixTotal();
        }
        return pt;
    }

    public void afficheToi() {
        System.out.printf("Facture numero %d ; Client : %s ; Date : %s %n",
                numero,client,date
                );
        System.out.printf("%7s  | %6s | %22s  | %10s | %10s %n",
                "Quant.","Réf","Nom","PU","PT"
        );
        for (int i = 0; i < nbLignes; i++ ){
            lignes[i].afficheToi();
        }
        System.out.println("Prix total de la facture : "+getPrixTotal());
    }


}
