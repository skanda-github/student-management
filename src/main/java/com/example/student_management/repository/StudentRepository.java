package com.example.student_management.repository;

import com.example.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicates this class handles database operations
public interface StudentRepository extends JpaRepository<Student, Long> {}
