package org.example.service;

import org.example.entity.Reservation;
import org.example.entity.Room;
import org.example.port.ReservationRepository;
import org.example.port.RoomRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;

    public ReservationService(ReservationRepository reservationRepository, RoomRepository roomRepository){
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
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

    public List<Reservation> findAll(){
        return reservationRepository.findAll();
    }
}
