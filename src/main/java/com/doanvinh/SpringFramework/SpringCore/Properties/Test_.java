package com.doanvinh.SpringFramework.SpringCore.Properties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test_ {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(DBConnection.class);

        ConfigurableApplicationContext context1 =
                new AnnotationConfigApplicationContext(MailConfig.class);

        DBConnection dbConnection = context.getBean(DBConnection.class);
        System.out.println(dbConnection.getServerPort());
        System.out.println(dbConnection.getUsername());


        MailConfig mailConfig = context1.getBean(MailConfig.class);
        System.out.println(mailConfig);


    }
}
