package org.example.exercices;

public class Exo5 {
    public static void matrice1(){
        int[][] matrix = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};

        int maxValue = findMaxValue(matrix);
        System.out.println("la valeur la plus élevée est : " +  maxValue);
    }
    public static int findMaxValue(int[][] matrix){
        int maxValue = matrix[0][0];

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    private static void afficheTab(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print("[" + tableau[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void matrice2(){
        int[][] matrix = new int[4][5];
        int compteur  = 1;


        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = compteur++;
            }
            //System.out.println(compteur);
        }
        afficheTab(matrix);
        int sum = calcSum(matrix);
        System.out.println("somme : " + sum);
        int product = calcProd(matrix);
        System.out.println("produit total : " + product);
        double average = calcAverage(matrix);
        System.out.println("moyenne : " + average);


    }

    public static int calcProd(int[][] matrix){
        int product = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                product *= matrix[i][j];
            }
        }
        return product;
    }
    public static int calcSum(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static double calcAverage(int[][] matrix){
        int totalElements = matrix.length * matrix[0].length;
        int sum = calcSum(matrix);
        return (double) sum / totalElements;
    }
}
