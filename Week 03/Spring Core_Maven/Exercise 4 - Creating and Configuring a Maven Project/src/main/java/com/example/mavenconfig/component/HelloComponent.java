package com.example.mavenconfig.component;

import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
    public void sayHello() {
        System.out.println("Maven project is successfully configured!");
    }
}
