package com.example.useAnnotations;

public class Manager implements Staff{
    @Override
    public void assist(){
        System.out.println("managing");
    }
}
