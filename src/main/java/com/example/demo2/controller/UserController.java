package com.example.demo2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    private Optional<User> getUser(@PathVariable(name = "id") Long id){
        return this.userService.getUser(id);
    }

    @GetMapping
    public List<User> getAll() {
        return this.userService.getAll();
    }
}
