package exercice2;

import exercice2.controller.Ihm;
import exercice2.models.Product;
import exercice2.services.ProduitService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProduitService ps = new ProduitService();
        ps.begin();
        Ihm ihm = new Ihm();
        ihm.start();

        // Exercice 1

        // Creation des produits
    /*
        ps.create(new Product("TOSHIBA","zzaa123",new Date("2016/01/08"),6000.0));
        ps.create(new Product("HP","EER678",new Date("2016/02/09"),2000.0));
        ps.create(new Product("SONY","AQWZSX",new Date("2016/09/23"),6000.0));
        ps.create(new Product("DELL","AZERTY",new Date("2016/02/12"),6000.0));
        ps.create(new Product("SONY","qsdERT",new Date("2016/02/02"),6000.0));

        // Informations produit id = 2

        Product p = ps.findById(2);
        System.out.println(p);

        // Supprimer le produit id = 3
        //ps.delete(ps.findById(3));

        // Modifier produit id = 1

        /*p = ps.findById(1);
        if(p != null){
            p.setMarque("HP");
            p.setReference("MMMMPPP");
            p.setDateAchat(new Date("2015/09/08"));
            p.setPrix(5000.0);
            ps.update(p);
        }


        // Exercice 2

        System.out.println("############################");
        System.out.println("Afficher tous les produits");
        System.out.println("############################");
        List<Product> produits = ps.findAll();
        for (Product pr: produits) {
            System.out.println(pr.getId() + " " + pr.getReference());
        }
        System.out.println("############################");
        System.out.println("produits avec filtre prix");
        System.out.println("############################");

        try{
            List<Product> produits1 = ps.filterByPrice(4000);
            for (Product pr: produits1) {
                System.out.println(pr.getId() + " " + pr.getReference());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("############################");
        System.out.println("produits avec filtre date");
        System.out.println("############################");

        try{
            List<Product> produits2 = ps.filterByDate(new Date("2016/01/20"),new Date("2016/12/23"));
            for (Product pr: produits2) {
                System.out.println(pr.getId() + " " + pr.getReference());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       */




    }
}
