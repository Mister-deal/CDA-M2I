package com.example.adapterrest.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {
    private Long id;
    private RoomDTO roomDTO;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private LocalTime endTime;
}
