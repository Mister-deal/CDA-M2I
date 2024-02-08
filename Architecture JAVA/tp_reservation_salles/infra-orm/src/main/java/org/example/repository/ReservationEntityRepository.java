package org.example.repository;

import org.example.entity.ReservationEntity;

import java.util.List;

public class ReservationEntityRepository extends Repository<ReservationEntity> {
    @Override
    public ReservationEntity findById(Long id) {
        return session.get(ReservationEntity.class, id);
    }

    @Override
    public List<ReservationEntity> findAll() {
        return session.createQuery("from ReservationEntity ", ReservationEntity.class).list();
    }
}
