package com.example.jpaexample;

import com.example.jpaexample.entity.User;
import com.example.jpaexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        userRepository.save(new User("Durgesh Roy", "durgesh@example.com"));
        userRepository.findAll().forEach(user ->
            System.out.println(user.getId() + ": " + user.getName() + " - " + user.getEmail()));
    }
}
