package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public User getUserByParam(@RequestParam Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User getUserByJson(@RequestBody User user) {
        return userService.getUser(user.getId());
    }
}
