package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;

public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String getUserNameById(Long id) {
        User user = userRepo.findById(id);
        return user != null ? user.getName() : "User not found";
    }
}
