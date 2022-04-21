package com.dr4kk0nnys.project.controllers;

import java.util.HashMap;
import java.util.Map;

import com.dr4kk0nnys.project.models.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Map<String, User> users = new HashMap<>();

    @PostMapping("users/create-user")
    public User createUser(@RequestBody User user) {

        User newUser = new User(user);
        // users.put(newUser.getEmail(), newUser);
        // database.insert(
        // "INSERT INTO users VALUES ('Dr4kk0nnys Shinigami', 'ddrakk100@gmail.com',
        // '12345')");
        System.out.println("New user created: " + newUser.getName());

        return newUser;
    }

    @GetMapping("users/get-user")
    public User getUser(@RequestParam String email) {
        return users.get(email);
    }

    @PutMapping("users/update-user")
    public User updateUser(@RequestParam String email, @RequestBody User newUser) {
        User user = this.getUser(email);

        if (user == null) {
            return null;
        }

        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());

        users.put(user.getEmail(), user);

        return user;
    }

    @DeleteMapping("users/delete-user")
    public User deleteUser(@RequestParam String email) {
        return users.remove(email);
    }
}
