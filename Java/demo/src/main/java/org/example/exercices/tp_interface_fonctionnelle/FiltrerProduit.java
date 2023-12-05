package org.example.exercices.tp_interface_fonctionnelle;

import java.util.ArrayList;
import java.util.List;

public class FiltrerProduit {
    public static List<Produit> filtrageProduits(List<Produit> produits, CritereFiltrage critere){
        List<Produit> produitFiltres = new ArrayList<>();
        for(Produit produit: produits){
            if(critere.test(produit)){
                produitFiltres.add(produit);
            }
        }
        return produitFiltres;
    }
}
