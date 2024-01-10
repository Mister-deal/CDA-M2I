package exercice2.controller;

import exercice2.models.Commentaire;
import exercice2.models.Image;
import exercice2.models.Product;
import exercice2.services.ProduitService;
import org.hibernate.SessionFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ihm {

    private ProduitService produitService;
    private Scanner scanner;

    public Ihm() {
        produitService = new ProduitService();
        scanner = new Scanner(System.in);
    }

    public void start(){
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    valeurParMarque();
                    break;
                case "2":
                    moyenne();
                    break;
                case "3":
                    produitsMarques();
                    break;
                case "4":
                    deleteParMarque();
                    break;
                case "5":
                    addProduit();
                    break;
                case "6":
                    produitById();
                    break;
                case "7":
                    deleteProduit();
                    break;
                case "8":
                    updateProduit();
                    break;
                case "9":
                    afficheAllProduit();
                    break;
                case "10":
                    produitPriceMin();
                    break;
                case "11":
                    produitByDate();
                    break;
                case "12":
                    produitStockMin();
                    break;

            }
        }while(!choice.equals("0"));
        produitService.end();
    }

    private void menu() {
        System.out.println("########  Menu  #########");
        System.out.println("1 -- afficher la valeur du stock par marque");
        System.out.println("2 -- prix moyen des produits");
        System.out.println("3 -- produits de plusieurs marques");
        System.out.println("4 -- supprimer produit par marque");
        System.out.println("5 -- ajouter un produit");
        System.out.println("6 -- afficher un produit par id");
        System.out.println("7 -- supprimer un produit par id");
        System.out.println("8 -- mofifier un produit par id");
        System.out.println("9 -- afficher tous les produits");
        System.out.println("10 -- afficher les produits avec un prix supérieur à");
        System.out.println("11 -- afficher les produits achetés entre deux dates");
        System.out.println("12 -- afficher les produits avec un stock dessous d'un valeur");
        System.out.println("0 -- Quitter ");


    }

    private void valeurParMarque() {
        System.out.println("Merci de saisir la marque : ");
        String marque = scanner.nextLine();
        try {
            System.out.println("La valeur du stock est de : "+ produitService.valeurStockParMarque(marque) + " euros ");
        }
        catch(Exception ex) {
            System.out.println("La valeur est de 0");
        }
    }

    private void moyenne() {

        try {
            System.out.println("prix moyen est de : "+ produitService.moyenne() + " euros ");
        }
        catch(Exception ex) {
            System.out.println("erreur calcule moyenne");
        }
    }

    private void produitsMarques() {
        //Exemple de plusieurs marques
        List<String> marques = new ArrayList<>();
        marques.add("HP");
        marques.add("samsung");
        List<Product> produits = null;
        try {
            produits = produitService.filterByMarques(marques);
            for(Product pr :  produits) {
                System.out.println(pr.getId());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteParMarque() {
        System.out.println("Merci de saisir la marque : ");
        String marque = scanner.nextLine();
        try {
            produitService.deleteByMarque(marque);
            System.out.println("Suppression Ok");
        }
        catch(Exception ex) {
            System.out.println("erreur suppression");
        }
    }

    private void addProduit(){
        System.out.println("Merci de saisir la marque : ");
        String marque = scanner.nextLine();
        System.out.println("Merci de saisir la reference : ");
        String ref = scanner.nextLine();
        System.out.println("Merci de saisir la date d'achat (dd/MM/yyyy) : ");
        String dateS = scanner.nextLine();
        System.out.println("Merci de saisir le prix : ");
        double prix = scanner.nextDouble();
        System.out.println("Merci de saisir le stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        System.out.println("merci de saisir l'url ou les urls du produit");
        String[] imageArray = scanner.next().split(",");
        List<Image> images = new ArrayList<>();
        for (String imageUrl: imageArray){
            images.add(new Image(imageUrl));
        }

        Image image = new Image();
        image.setUrl(Arrays.toString(imageArray));
        //System.out.println("merci de saisir le commentaire du produit");
        //String[] commentaire = scanner.nextLine();
        //scanner.nextLine();
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
            produitService.create(new Product(marque,ref,date,prix,stock, images));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void produitById(){
        System.out.println("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product p = produitService.findById(id);
        System.out.println(p);
    }

    private void deleteProduit(){
        System.out.println("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product p = produitService.findById(id);
        produitService.delete(p);
    }

    private void updateProduit(){
        System.out.println("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product p = produitService.findById(id);
        System.out.println("Merci de saisir la marque : ");
        String marque = scanner.nextLine();
        p.setMarque(marque);
        System.out.println("Merci de saisir la reference : ");
        String ref = scanner.nextLine();
        p.setReference(ref);
        System.out.println("Merci de saisir la date d'achat (dd/MM/yyyy) : ");
        String dateS = scanner.nextLine();
        System.out.println("Merci de saisir le prix : ");
        double prix = scanner.nextDouble();
        p.setPrix(prix);
        System.out.println("Merci de saisir le stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        p.setStock(stock);
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
            p.setDateAchat(date);
            produitService.update(p);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void afficheAllProduit(){
        List<Product> produits = produitService.findAll();
        for (Product pr: produits) {
            System.out.println(pr);
        }
    }
    private void produitPriceMin(){
        try{
            System.out.println("Merci de saisir le prix minimum : ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            List<Product> produits1 = produitService.filterByPrice(price);
            for (Product pr: produits1) {
                System.out.println(pr.getId() + " " + pr.getReference());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void produitByDate(){
        try{
            System.out.println("Merci de saisir la date 1 (dd/MM/yyyy) : ");
            String s1 = scanner.nextLine();
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);

            System.out.println("Merci de saisir la date 2 (dd/MM/yyyy) : ");
            String s2 = scanner.nextLine();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(s2);

            List<Product> produits2 = produitService.filterByDate(date1,date2);
            for (Product pr: produits2) {
                System.out.println(pr.getId() + " " + pr.getReference());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void produitStockMin(){
        try {
            System.out.println("Merci de saisir le stock maximum : ");
            int max = scanner.nextInt();
            scanner.nextLine();
            List<Product> produitList = produitService.filterByStockMax(max);
            for (Product pr: produitList) {
                System.out.println(pr.getId() + " " + pr.getReference());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
