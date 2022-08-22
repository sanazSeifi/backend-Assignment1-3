package com.example.backendAssignment13.service;

import com.example.backendAssignment13.model.User;
import com.example.backendAssignment13.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// KEEP BUSINESS LOGIC IN SERVICE CLASS BASED ON SPRING BOOT STRUCTURE
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser() {
        return userRepository.getUser();


    }
}
