package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.DECEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

           Student Aditi =  new Student(
                    "Aditi",
                    "Aditi@gmail.com", LocalDate.of(2000, DECEMBER,5),21
           );

            Student Bhoomika =  new Student(
                    "Bhoomika",
                    "Bhoomika@gmail.com", LocalDate.of(2000, AUGUST,5),21
            );

            repository.saveAll(
                    List.of(Aditi,Bhoomika)
            );

        };
    }
}
