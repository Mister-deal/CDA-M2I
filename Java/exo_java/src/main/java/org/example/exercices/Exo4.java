package org.example.exercices;

import java.util.Scanner;

public class Exo4 {
    Scanner s = new Scanner(System.in);
    public static void ExoTab51(){
        Scanner s = new Scanner(System.in);

        System.out.println("entrez la taille du tableau :");
        int N = s.nextInt();
        int [] tableau = new int[N];

        System.out.println("remplissez le tableau :");
        for (int i = 0; i < N; i++){
            System.out.println("élément " + (i + 1) + " : ");
            tableau[i] = s.nextInt();
        }

        System.out.print("entrez la valeur à rechercher : ");
        int valeurRecherchee =  s.nextInt();
        int occurences = compterOccurences(tableau, valeurRecherchee);
        System.out.println("le nombre d'occurences de la valeur : " + valeurRecherchee);
    }
    public static int compterOccurences(int[] tableau, int valeur) {
        int occurences = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] == valeur){
                occurences++;
            }
        }
        return occurences;
    }

    public static void exoTab52(){
        int[] tab = {1, 2, 3, 4, 5, 6};

        if(estCroissant(tab)) {
            System.out.println("le tableau est trié par ordre croissant");
        } else{
            System.out.println("le tableau est trié par ordre décroissant");
        }
    }

    public static boolean estCroissant(int[] tab){
        for (int i = 0; i <tab.length - 1; i++) {
            if(tab[i] > tab[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void exoTab55() {
        int[] tab = {1, 2, 3, 4, 5};
        inverser(tab);
        System.out.print("Tableau inversé : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }

    public static void inverser(int[] tab){
        int first = 0;
        int last = tab.length -1 ;

        while(first < last){
            int temp =  tab[first];
            tab[first] = tab[last];
            tab[last] = temp;

            first++;
            last--;
        }
    }

    public static void exoTab56(){
        int[] tab = {8,3,5,4,7,9,6,2,1};
        tri(tab);

        System.out.print("Tableau trié : ");
        for(int i =  0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }

    }

    public static void tri(int[] tab){
        int n = tab.length;
        for(int i = 0; i < n - 1; i++){
           int min = i;
           for(int j = i + 1; j < n; j++){
               if(tab[j] < tab[min]){
                   min = j;
               }
           }
           int temp = tab[min];
           tab[min] = tab[i];
           tab[i] = temp;
        }
    }
}
