package com.dr4kk0nnys.project.controllers;

import com.dr4kk0nnys.project.models.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("users/create-user")
    public User createUser(@RequestBody User user) {

        User newUser = new User(user);
        System.out.println("New user created: " + newUser.getFullName());

        return newUser;
    }

}
