package com.example.useAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InvestmentBanker implements Staff {
    @Override
    public void assist(){
        System.out.println("investing");
    }
}
