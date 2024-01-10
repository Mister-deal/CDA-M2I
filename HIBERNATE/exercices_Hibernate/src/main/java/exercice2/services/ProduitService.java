package exercice2.services;

import exercice2.interfaces.Repository;
import exercice2.models.Image;
import exercice2.models.Product;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class ProduitService extends BaseService implements Repository<Product> {

    public ProduitService() {
        super();
    }

    @Override
    public boolean create(Product o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Product o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Product o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Product findById(int id) {
        Product produit = null;
        session = sessionFactory.openSession();
        produit = (Product) session.get(Product.class, id);
        session.close();
        return produit;
    }

    @Override
    public List<Product> findAll() {
        List<Product> produitList = null;
        session = sessionFactory.openSession();
        Query<Product> produitQuery = session.createQuery("from Product");
        produitList = produitQuery.list();
        session.close();
        return produitList;
    }

    public List<Product> filterByPrice(double min) throws Exception {
        if (min >= 0) {
            session = sessionFactory.openSession();
            Query<Product> produitQuery = session.createQuery("from Product where prix >= :min");
            produitQuery.setParameter("min", min);
            List<Product> produitList = produitQuery.list();
            session.close();
            return produitList;
        }
        throw new Exception("erreur valeur");
    }

    public List<Product> filterByDate(Date min, Date max) throws Exception {
        if (min.before(max)) {
            session = sessionFactory.openSession();
            Query<Product> produitQuery = session.createQuery("from Product where dateAchat >= :min and dateAchat <= :max ");
            produitQuery.setParameter("min", min);
            produitQuery.setParameter("max", max);
            List<Product> produitList = produitQuery.list();
            session.close();
            return produitList;
        }
        throw new Exception("erreur date");
    }

    public List<Product> filterByStockMax(int max) throws Exception {
        if (max >= 0) {
            session = sessionFactory.openSession();
            Query<Product> produitQuery = session.createQuery("from Product where stock < :max");
            produitQuery.setParameter("max", max);
            List<Product> produitList = produitQuery.list();
            session.close();
            return produitList;
        }
        throw new Exception("erreur valeur");
    }

    public double valeurStockParMarque(String marque) {
        double valeur = 0.0;
        try {
            session = sessionFactory.openSession();
            Query<Double> query = session.createQuery("SELECT SUM(p.prix * p.stock) FROM Product p WHERE p.marque = :marque", Double.class);
            query.setParameter("marque", marque);
            Double result = query.getSingleResult();

            if (result != null) {
                valeur = result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return valeur;
    }

    public double moyenne() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Double> query = session.createQuery("select avg(prix) from Product ");
        double moy = query.uniqueResult();
        session.close();
        return moy;
    }

    public List<Product> filterByMarques(List<String> marques) throws Exception {
        if (marques.size() > 0) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Product> produitQuery = session.createQuery("from Product where marque in :marques");
            produitQuery.setParameter("marques", marques);
            List<Product> produitList = produitQuery.list();
            session.getTransaction().commit();
            session.close();
            return produitList;
        }
        throw new Exception("aucune marque");
    }

    public boolean deleteByMarque(String marque) {

        session = sessionFactory.openSession();

        Query query = session.createQuery("delete Product where marque = :marque");
        query.setParameter("marque", marque);
        session.getTransaction().begin();
        int success = query.executeUpdate(); // C'est le nombre de ligne affectée par la requete
        session.getTransaction().commit();
        session.close();
        return success > 0;
    }



    public void begin() {
        session = sessionFactory.openSession();
    }

    public void end() {

        //  session.close();
        sessionFactory.close();
    }
}
