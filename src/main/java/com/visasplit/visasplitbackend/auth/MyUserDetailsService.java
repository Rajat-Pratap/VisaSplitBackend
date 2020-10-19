package com.visasplit.visasplitbackend.auth;

import com.visasplit.visasplitbackend.models.User;
import com.visasplit.visasplitbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByName(username);

        return user.map(MyUserDetails::new).orElseThrow(()->new UsernameNotFoundException("Not Found!"));
    }
}
