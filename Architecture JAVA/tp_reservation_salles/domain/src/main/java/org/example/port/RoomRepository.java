package org.example.port;

import org.example.entity.Room;

import java.util.List;

public interface RoomRepository {
    void create(Room room);
    void delete(Room room);
    Room findById(Long id);
}
