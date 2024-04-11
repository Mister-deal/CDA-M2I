package org.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departement")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departement", orphanRemoval = true)
    private List<Salarie> salarieList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
