package com.doanvinh.SpringFramework.SpringCore.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMS")
public class SMSMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send by SMS: " + message);
    }
}
