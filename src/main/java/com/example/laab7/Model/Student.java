package com.example.laab7.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    @NotNull(message = "All should not be empty")
    private Integer id;
    @NotEmpty(message = "All should not be empty")
    private String name;
    @NotNull(message = "All should not be empty")
    private Integer age;
    @NotEmpty(message = "All should not be empty")
    private Double GPA;
}
