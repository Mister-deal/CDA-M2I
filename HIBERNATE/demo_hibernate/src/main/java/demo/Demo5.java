package demo;

import demo.embedded.Agence;
import demo.embedded.AgenceId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo5 {
    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        AgenceId agenceId = new AgenceId(12345, "Lille-agence");
        Agence agence = new Agence(agenceId, "Rue des postes");
        session.save(agence);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
