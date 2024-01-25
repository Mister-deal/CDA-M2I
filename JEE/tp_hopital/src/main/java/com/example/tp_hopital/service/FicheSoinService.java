package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.FicheSoin;

import java.util.List;

public class FicheSoinService extends BaseService implements DAO<FicheSoin> {

    public FicheSoinService() {
        super();
    }

    @Override
    public boolean create(FicheSoin p) {
        return false;
    }

    @Override
    public boolean update(FicheSoin p) {
        return false;
    }

    @Override
    public boolean delete(FicheSoin p) {
        return false;
    }

    @Override
    public FicheSoin findById(int id) {
        return null;
    }

    @Override
    public List<FicheSoin> findAll() {
        return null;
    }
}
