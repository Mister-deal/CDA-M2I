package org.example;


import org.example.exercices.*;
import org.example.exercices.tpVendredi.Tableau2;
import org.example.operator.Operator;
import org.example.poo.Product;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCharactere;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variable.Variable;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        //Variable.getVariable();
       // Operator.getExpression();
       // Operator.getOperatorAndComparaison();
        // Structure.getSwitch();
       // ReadFromConsole.getReadWrite();
       // Exo1.solutionExo33();
        // Structure2.getBoucleFor();
       // Structure2.getBreakAndContinue();
        //Exo3.solutionExo58();
       //ChaineCharactere.getMethodString();
       //ChaineCharactere.getComparaisonString();
        //ChaineCharactere.getFormatString();
        //Exo4.exoCountLetters();
        //Tableau2.verificationCroissantTab();
        //Tableau2.solutionExo53Tableau();
        //Tableau2.solutionExo54Tableau();
        //Exo4.exoCountingWord();
        //Exo4.anagram();
        //Exo5.matrice1();
        //Exo5.matrice2();
        //Exo6.exo1();
        //Exo6.exo2();
        //Exo6.exo3();
        //Exo6.exoFactorielle();

        Product p = new Product();
        p.setId(10);
        p.setName("Iphone");
        System.out.println(p);
        Product p2 = new Product(10, "Table");
        System.out.println(p2);
        System.out.println(p2.getName());
        p2.setId(15);
        System.out.println(p2);
    }
}