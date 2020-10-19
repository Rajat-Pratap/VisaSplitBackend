package com.visasplit.visasplitbackend.controllers;

import com.visasplit.visasplitbackend.models.User;
import com.visasplit.visasplitbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/api/register")
    public Boolean Register(@RequestBody User user){
        repository.save(user);
        return true;
    }

    @GetMapping("/api/getUser/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return repository.findById(id);
    }
}
