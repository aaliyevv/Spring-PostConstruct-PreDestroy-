package com.ltc.studentmanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table (name = "Students")
public class StudentEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, message = "At least 3 letters")
    private String name;

    @Size(max = 20, message = "Not more than 20 letters")
    private String surname;

    @Email(message = "Write your email correctly, please." ,
            regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$\n")
    private String email;

    @NotEmpty(message = "Address info must be fully provided.")
    private String address;

    @NotNull (message = "Write correct phone number format.")
    @Pattern(regexp = "^\\+?[0-9\\s\\-()]{7,20}$\n")
    private String phoneNumber;


}