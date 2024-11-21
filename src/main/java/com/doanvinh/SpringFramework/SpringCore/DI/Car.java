package com.doanvinh.SpringFramework.SpringCore.DI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Scope("singleton") default Chỉ có một instance duy nhất của bean được tạo và
// chia sẻ trong toàn bộ Spring container.
@Scope("prototype") // Mỗi lần yêu cầu bean, Spring sẽ tạo một instance mới.
@Component
public class Car {
    private String model;
    private String color;
    private Engine engine;

    @Autowired
    public Car(@Qualifier("XKLS") Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
