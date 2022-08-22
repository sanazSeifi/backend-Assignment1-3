package com.example.backendAssignment13.resource;

import com.example.backendAssignment13.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @GetMapping("/user")
    public User getUser(){
        User user = new User("Sanaz", "Canada", 12, "http://www.profilePicUrl/api/user");
        return user;
    }
}
