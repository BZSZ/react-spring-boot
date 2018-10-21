package com.qqproject.demo.controller;

import com.qqproject.demo.entity.User;
import com.qqproject.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get")
    public String getUserById() {
        return "hello world";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
//        User userEntity = user;
        userRepository.save(user);
        return "success!";
    }
}
