package com.example.exo.service;

import com.example.exo.Dao.BaseDAO;
import com.example.exo.models.Product;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class ProductService extends BaseService implements BaseDAO<Product> {

    public ProductService() {
        super();
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        session = sessionFactory.openSession();
        product = (Product) session.get(Product.class, id);
        session.close();
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = null;
        session = sessionFactory.openSession();
        Query<Product> productQuery = session.createQuery("from Product");
        productList = productQuery.list();
        session.close();
        return productList;
    }

    @Override
    public boolean create(Product p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Product p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Product p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public List<Product> filterByPrice(double min) throws Exception {
        if(min >= 0) {
            session = sessionFactory.openSession();
            Query<Product> productQuery = session.createQuery("from Product where price >= :min");
            productQuery.setParameter("min", min);
            List<Product> productList = productQuery.list();
            session.close();
            return productList;
        }
        throw new Exception("erreur valeur");
    }

    public List<Product> filterByDate(Date min, Date max) throws Exception{
        if(min.before(max)){
            session = sessionFactory.openSession();
            Query<Product> produitQuery = session.createQuery("from Product where date >= :min and date <= :max ");
            produitQuery.setParameter("min",min);
            produitQuery.setParameter("max",max);
            List<Product> produitList = produitQuery.list();
            session.close();
            return produitList;
        }
        throw new Exception("erreur date");
    }
}
