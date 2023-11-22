package org.example.exercices.poo_exercices;

import org.example.poo.statics.Employee;

public class Chaise {


    public Chaise(String chaise) {

    }

    private int pied_chaise;

    private String materiaux;

    private String couleurs;


    public Chaise(int pied_chaise, String materiaux, String couleurs) {
        this.pied_chaise = pied_chaise;
        this.materiaux = materiaux;
        this.couleurs = couleurs;
    }

    public int getPied_chaise() {
        return pied_chaise;
    }

    public void setPied_chaise(int pied_chaise) {
        this.pied_chaise = pied_chaise;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(String couleurs) {
        this.couleurs = couleurs;
    }

    public Chaise() {

    }

}
