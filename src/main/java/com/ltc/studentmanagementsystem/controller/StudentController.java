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
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentEntity getById(@PathVariable Long id){
        return studentService.getById(id);
    }

    //R
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentEntity> getAll(){
        return studentService.getAll();
    }


    //U
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public StudentEntity update(@PathVariable Long id, @RequestParam StudentEntity studentEntity){
        return studentService.update(id, studentEntity);
    }


    //D
    @DeleteMapping("/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        studentService.delete(id);
    }

}