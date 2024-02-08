package org.example.port;

import org.example.entity.Reservation;

import java.util.List;

public interface ReservationRepository {
    void create(Reservation reservation);
    void delete(Reservation reservation);
    Reservation findById(Long id);
    List<Reservation> findAll();
}
