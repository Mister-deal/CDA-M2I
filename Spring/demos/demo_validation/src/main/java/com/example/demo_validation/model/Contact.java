package com.example.demo_validation.model;


import com.example.demo_validation.validation.MyValid;
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
    @MyValid(value = "za",message = "on avait dit zaza !!!")
    private String firstName;

    @NotNull
    @Size(min=3, message = "3 minimum svp")
    private String lastName;

    @Min(3)
    @Max(42)
    private Integer age;
}
