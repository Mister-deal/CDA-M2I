package exercice2.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Scanner;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenu;

    private int note;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Commentaire() {
    }

    public Commentaire(String contenu, int note, Date date) {
        this.contenu = contenu;
        this.note = note;
        this.date = date;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
