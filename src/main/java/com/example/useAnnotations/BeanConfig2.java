package com.example.useAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.useAnnotations")
public class BeanConfig2 {
    @Bean
    public Manager manager(){
        return new Manager();
    }

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }

    @Bean
    public InvestmentBanker investmentBanker(){
        return new InvestmentBanker();
    }
}
