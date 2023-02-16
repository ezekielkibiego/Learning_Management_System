package com.kibiego.Learning_Management_System.configuration;

import com.kibiego.Learning_Management_System.model.Course;
import com.kibiego.Learning_Management_System.model.Institution;
import com.kibiego.Learning_Management_System.repository.CourseRepository;
import com.kibiego.Learning_Management_System.repository.InstitutionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class InstitutionConfig {
    @Bean
    CommandLineRunner commandLineRunner(
        InstitutionRepository repository ) {
        return args -> {

            Institution Moringa = new Institution(
                    "Moringa School",
                    "Ngong' Road"
            );
            Institution KCA = new Institution(
                    "Kenya College of Accountancy",
                    "Thika Road"
            );
            Institution MKU = new Institution(
                    "Mt. Kenya University",
                    "Thika Town"
            );

            repository.saveAll(
                    Arrays.asList(Moringa, KCA, MKU)
            );
        };

    }





}
