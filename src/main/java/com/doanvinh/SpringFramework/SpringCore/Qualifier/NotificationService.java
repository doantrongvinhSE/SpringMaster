package com.doanvinh.SpringFramework.SpringCore.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private  MessageService messageService;

    @Autowired
    public NotificationService(@Qualifier("email") MessageService messageService) {
        this.messageService = messageService;
    }

    public void alert(String message) {
        messageService.sendMessage(message);

    }


}
