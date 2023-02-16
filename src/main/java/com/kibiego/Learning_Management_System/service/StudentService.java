package com.kibiego.Learning_Management_System.service;

import com.kibiego.Learning_Management_System.model.Student;
import com.kibiego.Learning_Management_System.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentById(student.getId());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("Student exists");
        }
    }

}

//    public List<Course> getCourses() {
//        return courseRepository.findAll();
//    }
//
//    public void addNewCourse(Course course) {
//        Optional<Course> courseOptional = courseRepository.findCourseByName(course.getName());
//        if (courseOptional.isPresent()){
//            throw new IllegalStateException("Course exists");
//        }
//    }