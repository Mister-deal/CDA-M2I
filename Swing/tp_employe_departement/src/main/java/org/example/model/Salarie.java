package org.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "salarie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Salarie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    private Role role;
    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;


}
