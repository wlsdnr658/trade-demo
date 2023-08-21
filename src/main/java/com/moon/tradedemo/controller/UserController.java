package com.moon.tradedemo.controller;

import com.moon.tradedemo.domain.user.User;
import com.moon.tradedemo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUsers(@PathVariable Long id) {
        return this.userRepository.findById(id).orElse(null);
    }
}
