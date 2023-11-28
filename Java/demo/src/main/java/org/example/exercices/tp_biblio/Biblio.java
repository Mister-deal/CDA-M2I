package org.example.exercices.tp_biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Biblio {

    private List<Livre> listeLivres;
    private List<Emprunt> listeEmprunts;

    public Biblio(List<Livre> listeLivres, List<Emprunt> listeEmprunts) {
        this.listeLivres = listeLivres;
        this.listeEmprunts = listeEmprunts;
    }

    public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
    }

    public void supprLivre(String idLivre){
        Integer idToCompare = Integer.valueOf(idLivre);
        listeLivres.removeIf(livre -> Integer.valueOf(livre.getId()).equals(idToCompare));
    }

    public List<Livre> trouverLivresParTitre(String titre) {
        List<Livre> livresTrouves = new ArrayList<>();
        for (Livre livre : listeLivres) {
            if (livre.getTitre().equals(titre)) {
                livresTrouves.add(livre);
            }
        }
        return livresTrouves;
    }
    public List<Livre> trouverLivresParAuteur(String auteur) {
        List<Livre> livresTrouves = new ArrayList<>();
        for (Livre livre : listeLivres) {
            if (livre.getAuteur().equals(auteur)) {
                livresTrouves.add(livre);
            }
        }
        return livresTrouves;
    }

}
