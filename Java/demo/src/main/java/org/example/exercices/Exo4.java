package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    public static void exoCountingWord(){
        String s = "this is a test sentence used in order to know the number of words inside the variable";

        int wordCount = countWords(s);
        System.out.println("Number of words : " + wordCount);

    }
    public static int countWords(String s){
        String[] words = s.split("\\s+");

        return words.length;
    }

    public static void exoCountLetters() {
        Scanner scanner = new Scanner(System.in);

        // Get the word from the user
        System.out.print("Enter a word: ");
        String word = scanner.next().toLowerCase(); // Convert to lowercase for case-insensitive counting

        // Get the letter to count
        System.out.print("Enter the letter to count: ");
        char letter = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for case-insensitive counting

        // Call the function to count the letter and print the result
        int letterCount = countLetter(word, letter);
        System.out.println("The letter '" + letter + "' appears " + letterCount + " times in the word '" + word + "'.");
    }

    // Function to count the number of times a letter appears in a word
    public static int countLetter(String word, char letter) {
        int count = 0;

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            // Check if the character matches the letter
            if (word.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

    public static boolean areAnagrams(String str1, String str2){
        str1 = str1.replaceAll("\\s" , "").toLowerCase();
        str2 = str2.replaceAll("\\s" , "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("ils n'ont pas le même nombre de caractères");
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void anagram(){
        String word1 = "silent";
        String word2 = "listen";

        if(areAnagrams(word1, word2)){
            System.out.println("les mots " + word1 + " et " + word2 + " sont des anagrammes!");
        }else{
            System.out.println("les mots " + word1 + " et " + word2 + " ne sont pas des anagrammes!");
        }
    }

}

