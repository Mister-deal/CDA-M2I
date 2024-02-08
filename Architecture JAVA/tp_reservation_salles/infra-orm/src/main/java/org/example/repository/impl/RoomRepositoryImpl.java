package org.example.repository.impl;

import org.example.entity.ReservationEntity;
import org.example.entity.Room;
import org.example.entity.RoomEntity;
import org.example.port.RoomRepository;
import org.example.repository.RoomEntityRepository;
import org.example.util.HibernateSession;
import org.hibernate.Session;

import java.util.stream.Collectors;

public class RoomRepositoryImpl implements RoomRepository {

    private final RoomEntityRepository roomEntityRepository;

    public RoomRepositoryImpl(RoomEntityRepository roomEntityRepository) {
        this.roomEntityRepository = roomEntityRepository;
    }

    @Override
    public void create(Room room) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session) {
            roomEntityRepository.setSession(session);
            RoomEntity roomEntity = RoomEntity.builder()
                    .capacity(room.getCapacity())
                    .build();
            roomEntityRepository.create(roomEntity);
            session.getTransaction().commit();
        }
        catch (Exception e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void delete(Room room) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            roomEntityRepository.setSession(session);
            RoomEntity roomEntity = roomEntityRepository.findById(room.getId());
            roomEntityRepository.delete(roomEntity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void update(Room room) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            roomEntityRepository.setSession(session);
                RoomEntity roomEntity = RoomEntity.builder()
                        .id(room.getId())
                        .capacity(room.getCapacity())
                        .reservations(room.getReservations()
                                .stream().map(
                                        reservation -> ReservationEntity.builder()
                                                .startDate(reservation.getStartDate())
                                                .startTime(reservation.getStartTime())
                                                .endDate(reservation.getEndDate())
                                                .endTime(reservation.getEndTime())
                                                .build())
                                .collect(Collectors.toList())
                        )
                        .build();
                roomEntityRepository.update(roomEntity);
                session.getTransaction().commit();
        }
        catch (Exception e){
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public Room findById(Long id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        roomEntityRepository.setSession(session);
        try (session) {
            RoomEntity roomEntity = roomEntityRepository.findById(id);
            return roomEntity.toRoom();
        }
    }
}
