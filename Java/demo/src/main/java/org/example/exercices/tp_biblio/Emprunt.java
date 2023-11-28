package org.example.exercices.tp_biblio;

public class Emprunt {

    private static int cmpt = 1;
    private String dateDebut;
    private String dateFin;

    private Livre livres;

    private Personne personnes;

    private int empruntNmb;

    public Emprunt(String dateDebut, String dateFin, Livre livres, Personne personnes) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.livres = livres;
        this.personnes = personnes;
        this.empruntNmb = cmpt++;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public Livre getLivres() {
        return livres;
    }

    public void setLivres(Livre livres) {
        this.livres = livres;
    }

    public Personne getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne personnes) {
        this.personnes = personnes;
    }

    public int getEmpruntNmb() {
        return empruntNmb;
    }

    public void setEmpruntNmb(int empruntNmb) {
        this.empruntNmb = empruntNmb;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "dateDebut ='" + dateDebut + '\'' +
                ", dateFin ='" + dateFin + '\'' +
                ", livres =" + livres +
                ", personnes =" + personnes +
                ", empruntNuméro =" + empruntNmb +
                '}';
    }
}
