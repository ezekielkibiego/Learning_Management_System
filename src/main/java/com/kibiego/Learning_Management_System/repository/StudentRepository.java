package com.kibiego.Learning_Management_System.repository;

import com.kibiego.Learning_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);
}
