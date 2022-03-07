create table if not exists "user"(
        id_user BIGSERIAL,
        first_name VARCHAR,
        second_name VARCHAR,
        password VARCHAR,
        login VARCHAR,
        email VARCHAR,
        img_url VARCHAR,
        birthday VARCHAR,
        primary key (id_user)
    );