package com.example.telega_bot.rep;

import com.example.telega_bot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,Long> {

}
