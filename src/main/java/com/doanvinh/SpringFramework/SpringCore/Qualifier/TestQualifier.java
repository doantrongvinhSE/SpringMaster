package com.doanvinh.SpringFramework.SpringCore.Qualifier;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestQualifier {
    public static void main(String[] args) {
        ApplicationContext testQualifierContext =
                SpringApplication.run(TestQualifier.class, args);

        NotificationService notificationService =
                testQualifierContext.getBean(NotificationService.class);

        System.out.println(notificationService);

        notificationService.alert("Update successful!");
    }
}
