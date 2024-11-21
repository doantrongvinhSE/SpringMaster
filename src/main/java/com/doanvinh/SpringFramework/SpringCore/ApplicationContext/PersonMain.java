package com.doanvinh.SpringFramework.SpringCore.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext personContext = new AnnotationConfigApplicationContext(PersonConfig.class);
        // ApplicationContext pContext = new AnnotationConfigApplicationContext("com.doanvinh.SpringFramework");
        Person myPerson = personContext.getBean(Person.class);
        System.out.println(myPerson);
    }
}
