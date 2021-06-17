package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student willow = new Student(
                    "Willow",
                    "willow.dog@gmail.com",
                    LocalDate.of(2014, Month.SEPTEMBER, 2)
            );

            Student gnash = new Student(
                    "Gnash",
                    "gnash.nhl@gmail.com",
                    LocalDate.of(2004, Month.SEPTEMBER, 2)
            );

            repository.saveAll(
                    List.of(willow, gnash)
            );
        };
    }
}
