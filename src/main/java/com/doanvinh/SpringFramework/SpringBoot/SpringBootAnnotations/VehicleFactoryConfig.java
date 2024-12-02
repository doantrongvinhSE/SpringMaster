package com.doanvinh.SpringFramework.SpringBoot.SpringBootAnnotations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration
@ConditionalOnClass(VehicleFactoryConfig.class)
public class VehicleFactoryConfig {
}
