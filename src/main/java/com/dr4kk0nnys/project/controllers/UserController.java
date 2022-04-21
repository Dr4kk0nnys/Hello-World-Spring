package com.dr4kk0nnys.project.controllers;

import java.util.List;
import java.util.Optional;

import com.dr4kk0nnys.project.models.User;
import com.dr4kk0nnys.project.services.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("users/get-users")
    public List<User> getUsers(User user) {
        List<User> users = usersRepository.findAll();
        return users;
    }

    @GetMapping("users/get-user")
    public Optional<User> getUser(@RequestParam Integer id) {
        return usersRepository.findById(id);
    }

    @PostMapping("users/create-user")
    public User createUser(@RequestBody User user) {
        User newUser = usersRepository.save(user);
        return newUser;
    }

    @PutMapping("users/update-user")
    public Optional<User> updateUser(@RequestParam Integer id, @RequestBody User newUser) throws Exception {
        Optional<User> user = usersRepository.findById(id);

        if (!user.isPresent()) {
            throw new Exception("User not found");
        }

        newUser.setId(user.get().getId());
        usersRepository.save(newUser);

        return user;
    }

    @DeleteMapping("users/delete-user")
    public User deleteUser(@RequestParam Integer id) {
        Optional<User> user = usersRepository.findById(id);
        usersRepository.delete(user.get());
        return user.get();
    }
}
