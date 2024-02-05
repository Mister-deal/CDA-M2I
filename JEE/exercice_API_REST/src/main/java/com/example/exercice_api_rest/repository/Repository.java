package com.example.exercice_api_rest.repository;

import org.hibernate.Session;

import java.util.List;

public abstract class Repository<T> {

    protected Session session;

    public Session getSession(){
        return session;
    }

    public Repository() {
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void create(T e) {
        this.session.persist(e);
    }

    public void delete(T element) {
        session.remove(element);
    }

    public void update(T element) {
        session.persist(element);
    }

    abstract T findById(int id);

    abstract List<T> findAll();
}
