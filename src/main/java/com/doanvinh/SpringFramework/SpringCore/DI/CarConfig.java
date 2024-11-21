package com.doanvinh.SpringFramework.SpringCore.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


@Configuration
public class CarConfig {
    @Bean(name = "default")
    @Primary
    public Engine engineDefault() {
        return new Engine("Default Engine", 0);
    }

    @Bean(name = "XKLS")
    @Scope("singleton")
    public Engine engineXKLS() {
        return new Engine("XKLS Engine", 100);
    }
}
