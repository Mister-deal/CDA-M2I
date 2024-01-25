package com.example.tp_hopital.dao;

import java.util.List;

public interface DAO<T> {

    boolean create(T p);

    boolean update(T p);

    boolean delete(T p);

    T findById(int id);

    List<T> findAll();
}
