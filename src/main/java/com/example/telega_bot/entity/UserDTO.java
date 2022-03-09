package com.example.telega_bot.entity;

import lombok.Data;

@Data
public class UserDTO {
    private Long idUser;

    private String firstName;

    private String secondName;

    private String login;

    private String email;

    private String imgUrl;

    private String birthDay;

    private String password;

}
