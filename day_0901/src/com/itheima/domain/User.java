package com.itheima.domain;

import javax.jws.soap.SOAPBinding;

public class User{

//    create table user(
//            id int primary key auto_increment,
//            username varchar(20),
//            password varchar(20),
//            email varchar(20),
//            name varchar(20),
//            sex varchar(10),
//            birthday date,
//            hobby varchar(50)
//    );
    private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String sex;
    private String birthday;
    private String hobby;

    public User(int id, String username, String password, String email, String name, String sex, String birthday, String hobby) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
