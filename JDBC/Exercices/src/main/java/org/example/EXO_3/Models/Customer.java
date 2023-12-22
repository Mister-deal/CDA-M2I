package org.example.EXO_3.Models;

import org.example.EXO_3.exceptions.CustomFormatException;

import java.util.List;

public class Customer {
    private int id;
    //    private static int count = 0;
    private String firstname;

    private String lastname;

    private String email;

    private List<Event> eventsTicket;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws CustomFormatException {
        String pattern = "^([a-zA-Z0-9_.-]+)@([a-z0-9-]+\\.?[a-z0-9-]+)\\.([a-z]{2,6})$";
        if(!pattern.matches(pattern)) {
            throw new CustomFormatException("Not correct email");
        }
        this.email = email;
    }

    public List<Event> getEventsTicket() {
        return eventsTicket;
    }

    public void setEventsTicket(List<Event> eventsTicket) {
        this.eventsTicket = eventsTicket;
    }
}
