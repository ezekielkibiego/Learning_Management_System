package com.kibiego.Learning_Management_System.service;


import com.kibiego.Learning_Management_System.model.Course;
import com.kibiego.Learning_Management_System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public void addNewCourse(Course course) {
        Optional<Course> courseOptional = courseRepository.findCourseByName(course.getName());
        if (courseOptional.isPresent()){
            throw new IllegalStateException("Course exists");
        }
    }
}

