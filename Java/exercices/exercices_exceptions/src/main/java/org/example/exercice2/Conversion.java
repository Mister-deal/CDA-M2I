package org.example.exercice2;

public class Conversion {
    public static void main(String[] args) {
        String chaine = "123";

        try {
            int entier = convertirEnEntier(chaine);
            System.out.println("Entier converti "+entier);
        }catch (NumberFormatException e){
            System.out.println("Erreur : conversion impossible ");
        }

    }

    public static int convertirEnEntier(String chaine){
        return Integer.parseInt(chaine);
    }
}
