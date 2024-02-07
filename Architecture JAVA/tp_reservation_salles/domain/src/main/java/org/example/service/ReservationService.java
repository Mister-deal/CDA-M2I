package org.example.service;

import org.example.entity.Reservation;
import org.example.entity.Room;
import org.example.port.ReservationRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public Reservation createReservation(Room room, LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime){
        Reservation reservation = new Reservation.Builder()
                .room(room)
                .startDate(startDate)
                .startTime(startTime)
                .endDate(endDate)
                .endTime(endTime)
                .build();
        reservationRepository.create(reservation);
        return reservation;
    }

    public void deleteReservation(Long id){
        Reservation reservation = reservationRepository.findById(id);
        if(reservation == null){
            throw new RuntimeException("Reservation not found");
        }
        reservationRepository.delete(reservation);
    }

    public Reservation findReservationByRoomId(Long roomId){
        return reservationRepository.findByRoom(roomId);
    }
}
