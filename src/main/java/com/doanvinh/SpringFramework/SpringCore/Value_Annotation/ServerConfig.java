package com.doanvinh.SpringFramework.SpringCore.Value_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig {
    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private int port;

    @Override
    public String toString() {
        return "ServerConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
