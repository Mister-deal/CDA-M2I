package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.Consultation;

import java.util.List;

public class ConsultationService extends BaseService implements DAO<Consultation> {

    public ConsultationService() {
        super();
    }

    @Override
    public boolean create(Consultation p) {
        return false;
    }

    @Override
    public boolean update(Consultation p) {
        return false;
    }

    @Override
    public boolean delete(Consultation p) {
        return false;
    }

    @Override
    public Consultation findById(int id) {
        return null;
    }

    @Override
    public List<Consultation> findAll() {
        return null;
    }
}
