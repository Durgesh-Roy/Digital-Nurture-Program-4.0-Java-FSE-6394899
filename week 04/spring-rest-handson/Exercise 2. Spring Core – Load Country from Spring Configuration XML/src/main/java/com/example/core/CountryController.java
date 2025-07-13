package com.example.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CountryController {
    @GetMapping("/country")
    public Country getCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country-config.xml");
        return (Country) context.getBean("country");
    }
}
