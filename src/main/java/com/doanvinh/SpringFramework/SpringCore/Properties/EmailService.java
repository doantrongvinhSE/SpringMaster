package com.doanvinh.SpringFramework.SpringCore.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private MailConfig mailConfig;

    @Autowired
    public EmailService(MailConfig mailConfig) {
        this.mailConfig = mailConfig;
    }








}
