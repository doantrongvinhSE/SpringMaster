package com.doanvinh.SpringFramework.SpringCore.LifeCycleBean;


import java.util.Scanner;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SimpleBean {

    // private DbConnection DbConnection;

    @PostConstruct
    public void init() {
        System.out.println("Bean đã được khởi tạo!");
    }

    @PreDestroy
    public void clean() {
        // DbConnection.close();
        System.out.println("Tài nguyên đã được giải phóng.");
    }



}
