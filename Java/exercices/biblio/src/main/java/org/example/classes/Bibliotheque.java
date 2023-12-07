package org.example.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    private List<Emprunt> emprunts;

    public Bibliotheque() {
        livres = new ArrayList<>();
        emprunts = new ArrayList<>();
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    private Livre trouverLivre(int id){
        Livre livre = null;
        for (Livre l : livres) {
            if (l.getId() == id) {
                livre = l;
                break;
            }
        }
        return livre;
    }

    private Emprunt trouverEmprunt(int id){
        Emprunt emprunt = null;
        for (Emprunt e : emprunts) {
            if (e.getLivre().getId() == id) {
                emprunt = e;
               // break;
            }
        }
        return emprunt;
    }

    public boolean ajouterLivre(Livre livre){
        return livres.add(livre);
    }

    public boolean supprimerLivre(int id) {
        Livre livre = trouverLivre(id);
        if(livre != null){
           return livres.remove(livre);
        }
        return false;
    }

    public ArrayList<Livre> trouverLivresParTitre(String titre){
        ArrayList<Livre> listes = new ArrayList<>();
        for (Livre l : livres) {
            if (l.getTitre().contains(titre)) {
                listes.add(l);
            }
        }
        return listes;
    }

    public ArrayList<Livre> trouverLivresParAuteur(String auteur){
        ArrayList<Livre> listes = new ArrayList<>();
        for (Livre l : livres) {
            if (l.getAuteur().contains(auteur)) {
                listes.add(l);
            }
        }
        return listes;
    }

    public boolean emprunterLivre(int idLivre, Personne personne){
        boolean result = false;
        Emprunt empruntExist = trouverEmprunt(idLivre);
        if (empruntExist == null || empruntExist.getDateFin().isBefore(LocalDate.now()) || empruntExist.getDateFin().equals(LocalDate.now())){
            Livre livre = trouverLivre(idLivre);
                    if(livre != null){
                        Emprunt emprunt = new Emprunt(livre,personne);
                        emprunts.add(emprunt);
                        result = true;
                    }
        }
        return result;
    }

    public boolean retournerLivre(int idLivre){
        boolean result = false;
        Emprunt empruntExist = trouverEmprunt(idLivre);
        if(empruntExist != null && empruntExist.getDateFin() == null){
            empruntExist.setDateFin(LocalDate.now());
            result = true;
        }

        return result;
    }
}
