package com.ltc.studentmanagementsystem.repo;

import com.ltc.studentmanagementsystem.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository <StudentEntity, Long> {

}
