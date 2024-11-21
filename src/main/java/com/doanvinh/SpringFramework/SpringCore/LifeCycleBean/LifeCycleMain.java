package com.doanvinh.SpringFramework.SpringCore.LifeCycleBean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext lContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        

        SimpleBean simpleBean = lContext.getBean(SimpleBean.class);
        System.out.println(simpleBean);

        lContext.close();

    }
}
