package com.example.useAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Engineer implements Staff{
    private String qualification;
    @Override
    public void assist(){
        System.out.println("problem sovling");
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
