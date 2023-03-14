package com.example.useAnnotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Doctor implements Staff {
    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
