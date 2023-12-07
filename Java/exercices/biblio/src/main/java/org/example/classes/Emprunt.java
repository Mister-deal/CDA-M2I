package org.example.classes;

import java.time.LocalDate;

public class Emprunt {

    private Livre livre;

    private Personne personne;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    public Emprunt(Livre livre, Personne personne) {
        this.livre = livre;
        this.personne = personne;
        this.dateDebut = LocalDate.now();
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Emprunt : " +
                "livre=" + livre +
                ", personne=" + personne +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '.';
    }
}
