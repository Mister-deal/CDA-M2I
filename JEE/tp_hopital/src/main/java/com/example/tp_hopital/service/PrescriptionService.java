package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.Patient;
import com.example.tp_hopital.entities.Prescription;
import org.hibernate.query.Query;

import java.util.List;

public class PrescriptionService extends BaseService implements DAO<Prescription> {

    public PrescriptionService() {
        super();
    }

    @Override
    public boolean create(Prescription p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Prescription p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Prescription p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Prescription findById(int id) {
        Prescription prescription = null;
        session = sessionFactory.openSession();
        prescription = (Prescription) session.get(Prescription.class, id);
        session.close();
        return prescription;
    }

    @Override
    public List<Prescription> findAll() {
        List<Prescription> prescriptionList = null;
        session = sessionFactory.openSession();
        Query<Prescription> prescriptionQuery = session.createQuery("from Prescription ");
        prescriptionList = prescriptionQuery.list();
        session.close();
        return prescriptionList;
    }
}
