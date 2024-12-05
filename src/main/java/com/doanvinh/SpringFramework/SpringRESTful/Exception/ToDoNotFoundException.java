package com.doanvinh.SpringFramework.SpringRESTful.Exception;

public class ToDoNotFoundException extends RuntimeException {
    public ToDoNotFoundException(String message) {
        super(message);
    }
}
