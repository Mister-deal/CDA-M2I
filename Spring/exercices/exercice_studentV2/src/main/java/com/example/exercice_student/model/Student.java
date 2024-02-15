package com.example.exercice_student.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private Long id;

    @NotNull(message = "ne peut pas être vide")
    @NotBlank
    private String firstName;

    @NotNull
    @Size(min = 3, message = "3 caractères minimum")
    private String lastName;

    @Min(10)
    @Max(21)
    private int age;

    @NotNull(message = "l'email ne peut être vide")
    @NotBlank
    private String email;


}
