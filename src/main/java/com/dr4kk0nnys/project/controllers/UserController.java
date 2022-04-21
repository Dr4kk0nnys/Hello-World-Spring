package com.dr4kk0nnys.project.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.dr4kk0nnys.project.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Map<String, User> users = new HashMap<>();

    @PostMapping("users/create-user")
    public User createUser(@RequestBody User user) {

        User newUser = new User(user);
        System.out.println("New user created: " + newUser.getFullName());
        users.put(newUser.getEmail(), newUser);

        return newUser;
    }

    @GetMapping("users/get-user")
    public User getUser(@RequestParam String email) {
        return users.get(email);
    }
}
