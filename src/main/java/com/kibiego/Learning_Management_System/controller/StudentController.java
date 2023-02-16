package com.kibiego.Learning_Management_System.controller;

import com.kibiego.Learning_Management_System.model.Student;
import com.kibiego.Learning_Management_System.service.CourseService;
import com.kibiego.Learning_Management_System.service.InstitutionService;
import com.kibiego.Learning_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService, InstitutionService institutionService, CourseService courseService) {
        this.studentService = studentService;
        this.institutionService = institutionService;
        this.courseService = courseService;
    }

    private final InstitutionService institutionService;

    private final CourseService courseService;
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
