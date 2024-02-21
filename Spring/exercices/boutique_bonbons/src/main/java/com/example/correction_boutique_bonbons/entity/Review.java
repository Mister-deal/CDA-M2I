package com.example.correction_boutique_bonbons.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    private long id;

    private int score;

    @ManyToOne
    private Candy candy;
}
