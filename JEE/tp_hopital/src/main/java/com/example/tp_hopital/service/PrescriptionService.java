package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.Prescription;

import java.util.List;

public class PrescriptionService extends BaseService implements DAO<Prescription> {

    public PrescriptionService() {
        super();
    }

    @Override
    public boolean create(Prescription p) {
        return false;
    }

    @Override
    public boolean update(Prescription p) {
        return false;
    }

    @Override
    public boolean delete(Prescription p) {
        return false;
    }

    @Override
    public Prescription findById(int id) {
        return null;
    }

    @Override
    public List<Prescription> findAll() {
        return null;
    }
}
