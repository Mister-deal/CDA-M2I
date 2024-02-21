package com.example.correction_boutique_bonbons.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class CandyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "candyOrder")
    private List<CandyOrderLine> candyList;
}
