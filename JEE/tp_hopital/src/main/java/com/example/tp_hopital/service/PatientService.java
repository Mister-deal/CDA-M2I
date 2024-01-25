package com.example.tp_hopital.service;

import com.example.tp_hopital.dao.DAO;
import com.example.tp_hopital.entities.Patient;
import org.hibernate.query.Query;

import java.util.List;

public class PatientService extends BaseService implements DAO<Patient> {

    public PatientService() {
        super();
    }

    @Override
    public boolean create(Patient p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Patient p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Patient p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Patient findById(int id) {
        Patient patient = null;
        session = sessionFactory.openSession();
        patient = (Patient) session.get(Patient.class, id);
        session.close();
        return patient;
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patientList = null;
        session = sessionFactory.openSession();
        Query<Patient> patientQuery = session.createQuery("from Patient ");
        patientList = patientQuery.list();
        session.close();
        return patientList;
    }
}
