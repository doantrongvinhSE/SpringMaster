package com.doanvinh.SpringFramework.SpringCore.ApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person newPerson() {
        return new Person();
    }
}




