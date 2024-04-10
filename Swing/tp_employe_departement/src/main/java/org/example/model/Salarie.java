package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "salarie")
public class Salarie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
