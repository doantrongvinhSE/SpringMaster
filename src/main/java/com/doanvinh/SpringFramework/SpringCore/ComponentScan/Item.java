package com.doanvinh.SpringFramework.SpringCore.ComponentScan;


import org.springframework.stereotype.Component;

@Component
public class Item {
    private String name;
    private String description;
    private double price;

    public Item() {
    }

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
