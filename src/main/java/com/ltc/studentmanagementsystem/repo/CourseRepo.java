package com.ltc.studentmanagementsystem.repo;

import com.ltc.studentmanagementsystem.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity,Long> {

}
