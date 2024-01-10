package entity;

import javax.persistence.*;

@Entity
@Table(name = "personneprojet")
public class Personneprojet {
    @EmbeddedId
    private PersonneprojetId id;

    @MapsId("personneId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personne_id", nullable = false)
    private Personne personne;

    @MapsId("projetId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projet_id", nullable = false)
    private Projet projet;

    public PersonneprojetId getId() {
        return id;
    }

    public void setId(PersonneprojetId id) {
        this.id = id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

}