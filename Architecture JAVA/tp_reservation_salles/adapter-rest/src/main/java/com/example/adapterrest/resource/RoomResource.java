package com.example.adapterrest.resource;

import com.example.adapterrest.dto.RoomDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.repository.RoomEntityRepository;
import org.example.repository.impl.RoomRepositoryImpl;
import org.example.service.RoomService;

@Path("room")
@Produces(MediaType.APPLICATION_JSON)
public class RoomResource {
    private RoomService roomService;

    public RoomResource(){
        roomService = new RoomService(new RoomRepositoryImpl(new RoomEntityRepository()));
    }

    @POST
    public Response post(RoomDTO roomDTO){
        try {
            roomService.createRoom(roomDTO.getCapacity());
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(500, "Erreur serveur").build();
        }
    }

    @PATCH
    public Response update(RoomDTO roomDTO){
        try {
            roomService.updateRoom(roomDTO.toRoom());
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(500, "Erreur serveur").build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        try {
            roomService.deleteRoom(id);
            return Response.ok().build();
        }catch (Exception ex) {
            return Response.status(500, "Erreur serveur").build();
        }
    }
}
