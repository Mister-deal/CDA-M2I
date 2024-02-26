package com.example.correction_service_tv.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
@Entity
@Data
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String genre;
    private String status;

    @OneToMany
    private List<Season> seasons;
}
