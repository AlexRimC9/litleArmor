package com.example.telega_bot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "friends")
public class FriendList {

    @Id
    private Long idUser;

    private Long idFriends;

}
