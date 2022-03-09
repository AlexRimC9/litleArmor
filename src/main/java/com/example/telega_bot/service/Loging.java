package com.example.telega_bot.service;

import com.example.telega_bot.entity.User;
import com.example.telega_bot.entity.UserDTO;
import com.example.telega_bot.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class Loging {

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserRep userRep;

    public User register(UserDTO userDTO) {
        User newUser = new User();
        newUser.setLogin(userDTO.getLogin());
        newUser.setEmail(userDTO.getEmail());
        newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        return userRep.save(newUser);
    }
}
