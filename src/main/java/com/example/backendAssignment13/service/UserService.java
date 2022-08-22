package com.example.backendAssignment13.service;

import com.example.backendAssignment13.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(){
        User user = new User("Sanaz", "Canada", 12, "http://www.profilePicUrl/api/user");
        return user;
    }
}
