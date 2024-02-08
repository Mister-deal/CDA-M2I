package com.example.adapterrest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.entity.Room;

import java.util.List;

@Getter
@Setter
@Builder
public class RoomDTO {
    private Long id;
    private int capacity;
    private List<ReservationDTO> reservations;

    public Room toRoom() {
        return new Room.Builder()
                .id(id)
                .capacity(capacity)
                .reservations(
                        getReservations().stream().map(
                                reservationDTO -> reservationDTO.toReservation()
                        )
                )
                .build();
    }
}
