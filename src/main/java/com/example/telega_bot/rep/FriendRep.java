package com.example.telega_bot.rep;

import com.example.telega_bot.entity.FriendList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRep extends JpaRepository<FriendList, Long> {
}
