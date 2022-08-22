package com.example.backendAssignment13.repository;

import com.example.backendAssignment13.model.User;

//KEEP DATA RELATED STUFF IN REPOSITORY CLASS AND GET DATA FROM DATABASE BASED ON SPRING BOOT STRUCTURE
    public class UserRepository {

     public User getUser(){
        User user = new User("Sanaz", "Canada", 12, "http://www.profilePicUrl/api/user");
        return user;
    }

}
