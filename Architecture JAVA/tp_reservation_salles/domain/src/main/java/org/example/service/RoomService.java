package org.example.service;

import org.example.entity.Room;
import org.example.port.RoomRepository;

public class RoomService {

    private final RoomRepository roomRepository;


    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room createRoom(int capacity){
        Room room = new Room.Builder().capacity(capacity).build();
        roomRepository.create(room);
        return room;
    }

    public void deleteRoom(Long id){
        Room room = roomRepository.findById(id);
        if(room == null){
            throw new RuntimeException("Room not found");
        }
        roomRepository.delete(room);
    }

    public void updateRoom(Room room){
        if (roomRepository.findById(room.getId()) == null){
            throw new RuntimeException("Room not found");
        }
        roomRepository.update(room);
    }

}
