package com.example.exo.Dao;

import java.util.List;

public interface BaseDAO<T> {

    T findById(int id);
    List<T> findAll();

    boolean delete(T p);
}
