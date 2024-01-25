package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserService extends BaseService implements DAO<User> {

    public UserService() {
        super();
    }

    @Override
    public boolean create(User p) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(p);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean update(User p) {
        return false;
    }

    @Override
    public boolean delete(User p) {
        return false;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    public User getById(long id){
        Session session = null;
        try {
            session = sessionFactory.openSession();
            User user = session.get(User.class, id);
            return user;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public User getByEmailPassword(User user) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Query<User> query = session.createQuery("FROM User WHERE email = :email AND mdp = :mdp", User.class);
            query.setParameter("email", user.getEmail());
            query.setParameter("mdp", user.getMdp());
            User user1 = query.uniqueResult();
            transaction.commit();;
            if(user1 != null) {
                return user1;
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();

        }
        return null;
    }

}
