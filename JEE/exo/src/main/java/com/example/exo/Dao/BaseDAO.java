package com.example.exo.Dao;

import java.util.List;

public interface BaseDAO<T> {

    T findById(int id);
    List<T> findAll();

    boolean create(T p);

    boolean update(T p);

    boolean delete(T p);

}
