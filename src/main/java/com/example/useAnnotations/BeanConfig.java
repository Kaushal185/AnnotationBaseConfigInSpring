package com.example.useAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.example.useAnnotations")
@Configuration
public class BeanConfig {
    @Bean
    public Student getStudent(){
        System.out.println("taken from bean");
        return new Student();
    }
//    @Bean("student2")
//    public Student createStudent(){
//        return new Student();
//    }

}
