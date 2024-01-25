package com.example.tp_hopital.entities;

import jakarta.persistence.*;

@Entity
public class FicheSoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String typeSoin;

    private int duree;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    public FicheSoin() {
    }

    public FicheSoin(String typeSoin, int duree) {
        this.typeSoin = typeSoin;
        this.duree = duree;
    }


    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public String getTypeSoin() {
        return typeSoin;
    }

    public void setTypeSoin(String typeSoin) {
        this.typeSoin = typeSoin;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
