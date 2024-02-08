package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private Long id;
    private int capacity;
    private List<Reservation> reservations = new ArrayList<>();

    public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    private Room(Builder builder){
        setId(builder.id);
        setCapacity(builder.capacity);
        setReservations(builder.reservations);
    }

    public static class Builder{
        private Long id;
        private int capacity;
        private List<Reservation> reservations;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder reservations(List<Reservation> reservations) {
            this.reservations = reservations;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }
}
