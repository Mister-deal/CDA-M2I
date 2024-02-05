package com.example.exercice_api_rest.entity;

import com.example.exercice_api_rest.dto.TaskDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String content;
    private Boolean status;

    public Task(String content, Boolean status) {
        this.content = content;
        this.status = status;
    }

    public TaskDTO taskDTO(){
        return TaskDTO.builder().id(id).content(content).status(status).build();
    }
}
