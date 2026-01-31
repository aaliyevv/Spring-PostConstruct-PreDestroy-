package com.ltc.studentmanagementsystem.service;

import com.ltc.studentmanagementsystem.repo.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepo courseRepo;


}
