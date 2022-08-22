package com.example.backendAssignment13.repository;

import com.example.backendAssignment13.model.User;

    public class UserRepository {

     public User getUser(){
        User user = new User("Sanaz", "Canada", 12, "http://www.profilePicUrl/api/user");
        return user;
    }

}
