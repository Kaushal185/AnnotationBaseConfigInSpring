package com.example.useAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void study(){
        System.out.println("studying is called");
    }
}
