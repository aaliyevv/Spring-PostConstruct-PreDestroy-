package com.ltc.studentmanagementsystem.service;

import com.ltc.studentmanagementsystem.model.StudentEntity;
import com.ltc.studentmanagementsystem.repo.StudentRepo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;


    @PostConstruct
    public void init(){
        System.out.println("System is up");
    }


    // C
    public StudentEntity create(StudentEntity studentEntity) {
        return studentRepo.save(studentEntity);
    }


    //R
    public StudentEntity getById(Long id){
        return studentRepo.findById(id).orElseThrow(
                ()-> new RuntimeException("Student not found"));
    }


    //R
    public List<StudentEntity> getAll(){
        return studentRepo.findAll();
    }


   


}