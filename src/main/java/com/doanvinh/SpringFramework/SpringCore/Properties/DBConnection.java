package com.doanvinh.SpringFramework.SpringCore.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custom.properties")
public class DBConnection {
    @Value("${my.server.port}")
    private String serverPort;

    @Value("${my.datasource.username}")
    private String username;


    public String getServerPort() {
        return serverPort;
    }

    public String getUsername() {
        return username;
    }
}
