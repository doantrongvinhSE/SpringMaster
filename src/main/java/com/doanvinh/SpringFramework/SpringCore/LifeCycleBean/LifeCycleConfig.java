package com.doanvinh.SpringFramework.SpringCore.LifeCycleBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {
    
    @Bean
    public SimpleBean newSimpleBean() {
        return new SimpleBean();
    }
}
