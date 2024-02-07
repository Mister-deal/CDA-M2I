package org.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private Long id;
    private Room room;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private LocalTime endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    private Reservation(Builder builder){
        this.setId(builder.id);
        this.setRoom(builder.room);
        this.setStartDate(builder.startDate);
        this.setEndDate(builder.endDate);
        this.setStartTime(builder.startTime);
        this.setEndTime(builder.endTime);
    }

    public static class Builder{
        private Long id;
        private Room room;
        private LocalDate startDate;
        private LocalTime startTime;
        private LocalDate endDate;
        private LocalTime endTime;

        public Builder id(Long id){
            this.id  = id;
            return this;
        }

        public Builder room(Room room){
            this.room = room;
            return this;
        }

        public Builder startDate(LocalDate startDate){
            this.startDate = startDate;
            return this;
        }

        public Builder startTime(LocalTime startTime){
            this.startTime = startTime;
            return this;
        }

        public Builder endDate(LocalDate endDate){
            this.endDate = endDate;
            return this;
        }

        public Builder endTime(LocalTime endTime){
            this.endTime = endTime;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }
}
