package org.example.entity;

public class Room {
    private Long id;

    private int capacity;

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

    private Room(Builder builder){
        this.setId(builder.id);
        this.setCapacity(builder.capacity);
    }

    public static class Builder{
        private Long id;
        private int capacity;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }
}
