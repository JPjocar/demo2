package com.example.demo2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id){
        return this.userRepository.findById(id);
    }

    public List<User> getAll(){
        return this.userRepository.findAll();
    }
}
