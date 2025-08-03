package com.example.di.client;

import com.example.di.config.AppConfig;
import com.example.di.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}
