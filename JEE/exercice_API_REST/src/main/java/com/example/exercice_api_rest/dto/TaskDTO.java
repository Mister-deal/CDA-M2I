package com.example.exercice_api_rest.dto;

import com.example.exercice_api_rest.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    Long id;
    String content;
    boolean status;

    public Task toEntity() {
        return Task.builder().content(content).status(status).build();
    }
}
