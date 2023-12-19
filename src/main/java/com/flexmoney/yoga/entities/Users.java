package com.flexmoney.yoga.entities;

import jakarta.persistence.*;

@Entity
public class Users {


    @Column(name = "Id",length = 500)
    public String Id;
    @Column(name = "name",length = 50)
    public String name;

    @Id
    @Column(name = "email")
    public String email;

    @Column(name = "age",length = 5)
    public String age;

    @Column(name = "password",length = 13)
    public String password;
//    @Column(name = "batch",length = 10)
//    public String batch;

    @Column(name = "gender",length = 10)
    public String gender;




}
