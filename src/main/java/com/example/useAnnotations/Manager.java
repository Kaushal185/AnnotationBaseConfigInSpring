package com.example.useAnnotations;

import org.springframework.context.annotation.Scope;

public class Manager implements Staff{
    private String qualification;
    @Override
    public void assist(){
        System.out.println("managing");
    }
    @Override
    public String toString(){
        return "{Qualification is: "+ this.qualification +"}";
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
