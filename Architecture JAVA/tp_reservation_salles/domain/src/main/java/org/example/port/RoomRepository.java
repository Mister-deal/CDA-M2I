package org.example.port;

import org.example.entity.Room;

public interface RoomRepository {
    void create(Room room);
    void delete(Room room);
    void update(Room room);
    Room findById(Long id);
}
