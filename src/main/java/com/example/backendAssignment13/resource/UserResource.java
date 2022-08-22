package com.example.backendAssignment13.resource;

import com.example.backendAssignment13.model.User;
import com.example.backendAssignment13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//KEEPING REST ENDPOINT API IN RESOURCE CLASS BASED ON SPRING BOOT STRUCTURE
@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
}
