package com.example.telega_bot.entity;


import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.Date;

@Data //Анотация ломбока я тебе говорил про нее, делает гетеры и сетеры, не помню на счет конструторов, но для конструктора есть отделльная аннотация
@Entity // на сколько я знаю при компиляции сервера спринг начинает собирать его по кусочкам и эта штука указывает что эта часть бд
@Table(name = "user") // указываю для репозитория что работаем с вот этим и называется это так
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String firstName;

    private String secondName;

    private String password;

    private String login;

    private String email;

    private String imgUrl;

    private String birthDay; //TODO можем повыебываться и сделать автоматический рассчет количества лет по нынешней дате - дате рождения
    //TODO но я не знаю как это на автоматику повлияет, нужно подумать.

}
