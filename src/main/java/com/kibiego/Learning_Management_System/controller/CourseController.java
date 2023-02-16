package com.kibiego.Learning_Management_System.controller;

import com.kibiego.Learning_Management_System.model.Course;
import com.kibiego.Learning_Management_System.model.Institution;
import com.kibiego.Learning_Management_System.service.CourseService;
import com.kibiego.Learning_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/courses")
public class CourseController {
    private final CourseService courseService;

    private final StudentService studentService;

    @Autowired
    public CourseController(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }
    @GetMapping
    public List<Course> getCourses(){
        return courseService.getCourses();

    }
    // Add a new institution

    @PostMapping
    public void registerNewCourse(@RequestBody Course course) {
        courseService.addNewCourse(course);
    }


}
