package com.doanvinh.SpringFramework.SpringCore.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackages = "com/doanvinh/SpringFramework/SpringCore/ComponentScan")
@ComponentScan(basePackageClasses = Item.class)
public class Store {
    private String name;
    private String address;
    private String phone;
    private Item item;


    @Autowired
    public Store(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", item=" + item +
                '}';
    }
}
