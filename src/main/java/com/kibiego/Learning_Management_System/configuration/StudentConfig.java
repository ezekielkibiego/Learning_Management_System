package com.kibiego.Learning_Management_System.configuration;

import com.kibiego.Learning_Management_System.model.Institution;
import com.kibiego.Learning_Management_System.model.Student;
import com.kibiego.Learning_Management_System.repository.InstitutionRepository;
import com.kibiego.Learning_Management_System.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
public class StudentConfig {
//    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository ) {
        return args -> {

            Student Jane = new Student(
                    "Jane",
                    "Njeri",
                    "jane@gmail.com"

            );


            repository.saveAll(
                    Arrays.asList(Jane)
            );
        };

    }
}
