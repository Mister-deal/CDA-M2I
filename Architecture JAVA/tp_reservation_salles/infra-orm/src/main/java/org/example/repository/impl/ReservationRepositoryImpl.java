package org.example.repository.impl;

import org.example.entity.Reservation;
import org.example.entity.ReservationEntity;
import org.example.entity.RoomEntity;
import org.example.port.ReservationRepository;
import org.example.repository.ReservationEntityRepository;
import org.example.util.HibernateSession;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationRepositoryImpl implements ReservationRepository {

    private final ReservationEntityRepository reservationEntityRepository;

    public ReservationRepositoryImpl(ReservationEntityRepository reservationEntityRepository) {
        this.reservationEntityRepository = reservationEntityRepository;
    }


    @Override
    public void create(Reservation reservation) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session) {
            reservationEntityRepository.setSession(session);
            ReservationEntity reservationEntity = ReservationEntity.builder()
                    .roomEntity(RoomEntity.builder()
                            .capacity(reservation.getRoom().getCapacity())
                            .reservations(reservation.getRoom().getReservations().stream().map(
                                    reservation1 -> ReservationEntity.builder()
                                            .startDate(reservation1.getStartDate())
                                            .startTime(reservation1.getStartTime())
                                            .endDate(reservation1.getEndDate())
                                            .endTime(reservation1.getEndTime())
                                            .build()
                            ).collect(Collectors.toList()))
                            .build())
                    .startDate(reservation.getStartDate())
                    .startTime(reservation.getStartTime())
                    .endDate(reservation.getEndDate())
                    .endTime(reservation.getEndTime())
                    .build();
            reservationEntityRepository.create(reservationEntity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void delete(Reservation reservation) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session) {
            reservationEntityRepository.setSession(session);
            ReservationEntity reservationEntity = reservationEntityRepository.findById(reservation.getId());
            reservationEntityRepository.delete(reservationEntity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public Reservation findById(Long id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        reservationEntityRepository.setSession(session);
        try (session) {
            ReservationEntity reservationEntity = reservationEntityRepository.findById(id);
            return reservationEntity.toReservation();
        }
    }

    @Override
    public List<Reservation> findAll() {
        Session session = HibernateSession.getSessionFactory().openSession();
        reservationEntityRepository.setSession(session);
        try (session) {
            return reservationEntityRepository.findAll().stream()
                    .map(ReservationEntity::toReservation)
                    .collect(Collectors.toList());
        }
    }
}
