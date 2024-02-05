package com.example.exercice_api_rest.services;

import com.example.exercice_api_rest.dto.TaskDTO;
import com.example.exercice_api_rest.entity.Task;
import com.example.exercice_api_rest.repository.TaskRepository;
import com.example.exercice_api_rest.utils.HibernateSession;
import jakarta.inject.Inject;
import org.hibernate.Session;

public class TaskService {

    private final TaskRepository taskRepository;

    @Inject
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = taskDTO.toEntity();
        Session session = HibernateSession.getSessionFactory().openSession();
        taskRepository.setSession(session);
        session.beginTransaction();
        try {
            taskRepository.create(task);
            session.getTransaction().commit();
            return task.taskDTO();
        }catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }
}
