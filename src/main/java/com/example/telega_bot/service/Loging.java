package com.example.telega_bot.service;

import com.example.telega_bot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    PasswordEncoder passwordEncoder;

    public void register(String login, String password, String email) {
        User newUser = new User();
        newUser.setLogin(login);
        newUser.setEmail(email);
        newUser.setPassword(passwordEncoder.encode(password));
    }
}
