package com.EMS.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    @NotBlank(message = "Department cannot be blank")
    private String department;

    @Min(value = 10000, message = "Salary must be at least 10000")
    private double salary;
}
