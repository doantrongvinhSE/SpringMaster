package com.doanvinh.SpringFramework.SpringCore.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("email")
@Primary // ưu tiên first khi scan ra the same beans.
public class EmailMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Send by Email: " + message);
    }
}
