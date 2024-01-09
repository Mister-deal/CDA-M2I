package exercice2.services;

import exercice2.interfaces.Repository;
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
        return true;
    }

    @Override
    public boolean update(Product o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Product o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
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
        Query<Product> produitQuery = session.createQuery("from Product");
        produitList = produitQuery.list();
        return produitList;
    }

    public List<Product> filterByPrice(double min) throws Exception{
        if (min >= 0){
            Query<Product> produitQuery = session.createQuery("from Product where prix >= :min");

            return produitQuery.list();
        }
        throw new Exception("erreur valeur");
    }


    public List<Product> filterByDate(Date min, Date max) throws Exception{
        if(min.before(max)){

            Query<Product> produitQuery = session.createQuery("from Product where dateAchat >= :min and dateAchat <= :max ");
            produitQuery.setParameter("min",min);
            produitQuery.setParameter("max",max);

            return produitQuery.list();
        }
        throw new Exception("erreur date");
    }



    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }
}
