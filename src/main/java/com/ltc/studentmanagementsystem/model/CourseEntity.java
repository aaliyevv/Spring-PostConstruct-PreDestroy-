package com.ltc.studentmanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
@Table
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1, message = "Not less than 1 character")
    private String courseName;

    @DecimalMin(value = "100", message = "Not less than 100 AZN")
    private double price;

    @Max(value = 50, message = "Not more than 50 characters")
    private String address;


}
