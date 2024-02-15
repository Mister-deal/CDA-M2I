package com.example.demo_validation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @NotNull(message = "on a dis pas nul !!!!")
    @NotBlank
    private String firstName;

    @NotNull
    @Size(min=3, message = "3 minimum svp")
    private String lastName;

    @Min(3)
    @Max(42)
    private Integer age;
}
