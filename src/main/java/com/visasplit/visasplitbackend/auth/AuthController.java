package com.visasplit.visasplitbackend.auth;

import com.visasplit.visasplitbackend.models.User;
import com.visasplit.visasplitbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Optional;

public class AuthController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/api/login")
    public User authentication(Principal principal){
        String name= principal.getName();
        Optional<User> user= userRepository.findByName(name);
        return user.orElseThrow(()->new UsernameNotFoundException("Not Found!"));
    }
}
