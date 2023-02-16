package com.kibiego.Learning_Management_System.configuration;

import com.kibiego.Learning_Management_System.model.Course;
import com.kibiego.Learning_Management_System.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class CourseConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            CourseRepository repository) {
        return args -> {

            Course SD = new Course(
                    "SD",
                    12,
                    "A short course"
            );


            repository.saveAll(
                    Arrays.asList(SD)
            );
        };
    }
}
