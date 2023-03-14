package com.example.useAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
    private String qualification;
    public void assist(){
        System.out.println("Doctor is assisting");
    }
    @Override
    public String toString(){
        return "{ qualification is : " + qualification +"}";
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
