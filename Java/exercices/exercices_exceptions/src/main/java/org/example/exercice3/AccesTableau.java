package org.example.exercice3;

public class AccesTableau {
    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5};

        try {
            int element = getElement(tableau,5);
            System.out.println("Element : "+element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erreur : Index hors limites !!!");
        }

    }

    public static int getElement(int[] tableau, int index){
        return tableau[index];
    }
}
