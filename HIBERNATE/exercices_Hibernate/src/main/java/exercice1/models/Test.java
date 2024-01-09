package exercice1.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //création de 5 produits

        Product p = new Product();
        p.setStock(7);
        p.setMarque("Fabios");
        p.setPrix(25.99);
        p.setReference("pantalon");
        session.save(p);

        System.out.println("Produit : " + p.getId());

        Product p2 = new Product();
        p.setStock(15);
        p.setMarque("abibas");
        p.setPrix(35.99);
        p.setReference("survêtement");
        session.save(p2);

        System.out.println("Produit : " + p2.getId());

        Product p3 = new Product();
        p.setStock(5);
        p.setMarque("yves st laurel");
        p.setPrix(49.99);
        p.setReference("parfum");
        session.save(p3);

        System.out.println("Produit : " + p3.getId());

        Product p4 = new Product();
        p.setStock(10);
        p.setMarque("nick");
        p.setPrix(80.99);
        p.setReference("chaussures");
        session.save(p4);

        System.out.println("Produit : " + p4.getId());

        Product p5 = new Product();
        p.setStock(2);
        p.setMarque("jack babel");
        p.setPrix(109.99);
        p.setReference("blouson");
        session.save(p5);

        System.out.println("Produit : " + p5.getId());

        // récupérer l'id numéro 2
        Product product = session.get(Product.class, 2l);
        System.out.println("Produit n°2 : " + product);

        //suppression du produit id 3

        //Product productDel = session.get(Product.class, 3l);
        //session.delete(productDel);

        //modification du produit id 1
        Product productUpdate = session.get(Product.class, 1l);
        productUpdate.setPrix(50.55);
        productUpdate.setStock(4);
        session.update(productUpdate);







        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
