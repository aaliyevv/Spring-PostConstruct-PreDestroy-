package com.ltc.studentmanagementsystem.controller;

import com.ltc.studentmanagementsystem.model.StudentEntity;
import com.ltc.studentmanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseStatus
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studetnService) {
        this.studentService = studetnService;
    }


    //C
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentEntity create(@RequestParam StudentEntity studentEntity){
        return studentService.create(studentEntity);
    }


    //R
