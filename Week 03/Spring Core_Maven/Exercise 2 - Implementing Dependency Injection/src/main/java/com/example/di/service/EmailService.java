package com.example.di.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    public String getMessage() {
        return "Email sent using Dependency Injection!";
    }
}
