package com.example.exercice_api_rest.resource;

import com.example.exercice_api_rest.dto.TaskDTO;
import com.example.exercice_api_rest.repository.Repository;
import com.example.exercice_api_rest.services.TaskService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("tasks")
public class TaskResource {

    private final TaskService taskService;


    @Inject
    public TaskResource(TaskService todoService) {
        this.taskService = todoService;
    }

    @GET
    public String get() {
        return "list Tasks";
    }

    @GET
    @Path("{id}")
    public String get(@PathParam("id") int id) {
        return "task "+id;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TaskDTO post(TaskDTO taskDTO) {
        return taskService.createTask(taskDTO);
    }

    @PATCH
    @Path("{id}")
    public String pathStatus(@PathParam("id") int id) {
        return "update status "+id;
    }

    @DELETE
    @Path("{id}")
    public String delete(@PathParam("id") int id) {
        return "delete "+id;
    }
}
