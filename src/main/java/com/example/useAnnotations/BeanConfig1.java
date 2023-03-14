package com.example.useAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.useAnnotations")
public class BeanConfig1 {
    //Using Configuration annotation we can directly scan packages containing our classes without using xml file
    // ComponentScan annotation scan our classes from defined packages
    // for this we need to create our object of ApplicationContext using new AnnotationConfigApplicationContext()


    // Here instead of defining Manger class with @Component annotation we can use Bean annotation here only
    // create method which return object of given class and add @Bean annotation over method


}
