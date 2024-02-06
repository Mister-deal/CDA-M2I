package org.example.repository;

import org.hibernate.Session;

import java.util.List;

public abstract class BaseEntityRepository<T> {

    protected Session session;

    public Session getSession() {
        return session;
    }

    public BaseEntityRepository() {
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void create(T e) {
        this.session.persist(e);
    }

    public void delete(T e) {
        session.remove(e);
    }

    public void update(T e) {
        session.persist(e);
    }

    abstract T findById(Long id);

    abstract List<T> findAll();
}
