package org.example.entity;

public class Book {

    private Long id;

    private String title;

    private String genre;

    private int nbrPages;

    public Book(String title, String genre, int nbrPages) {
        this.title = title;
        this.genre = genre;
        this.nbrPages = nbrPages;
    }

    public Book(Long id, String title, String genre, int nbrPages) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.nbrPages = nbrPages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

}
