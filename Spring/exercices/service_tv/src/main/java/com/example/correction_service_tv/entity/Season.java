package com.example.correction_service_tv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int number;

    @ManyToOne
    private Series series;

}

