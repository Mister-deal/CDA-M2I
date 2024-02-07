package org.example.port;

import org.example.entity.Reservation;
import org.example.entity.Room;

public interface ReservationRepository {
    void create(Reservation reservation);
    void delete(Reservation reservation);
    Reservation findById(Long id);
    Reservation findByRoom(Long roomId);
}
