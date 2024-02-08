package com.example.adapterrest.resource;

import com.example.adapterrest.dto.ReservationDTO;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.example.entity.Room;
import org.example.repository.ReservationEntityRepository;
import org.example.repository.RoomEntityRepository;
import org.example.repository.impl.ReservationRepositoryImpl;
import org.example.repository.impl.RoomRepositoryImpl;
import org.example.service.ReservationService;

import java.util.List;

@Path("reservation")
public class ReservationResource {
    private ReservationService reservationService;

    public ReservationResource(){
        reservationService  = new ReservationService(
                new ReservationRepositoryImpl(
                        new ReservationEntityRepository()
                ),
                new RoomRepositoryImpl(
                        new RoomEntityRepository()
                )
        );
    }

    @POST
    public Response post(ReservationDTO reservationDTO){
        try{
            Room room = reservationDTO.getRoomDTO().toRoom();
            reservationService.createReservation(reservationDTO.getRoomDTO(),
                    reservationDTO.getStartDate(),
                    reservationDTO.getStartTime(),
                    reservationDTO.getEndDate(),
                    reservationDTO.getEndTime());
        }
    }
}
