package org.example.repository;

import org.example.entity.RoomEntity;

import java.util.List;

public class RoomEntityRepository extends Repository<RoomEntity> {

    @Override
    public RoomEntity findById(Long id) {
        return session.get(RoomEntity.class, id);
    }

    @Override
    public List<RoomEntity> findAll() {
        return session.createQuery("from RoomEntity ", RoomEntity.class).list();
    }
}
