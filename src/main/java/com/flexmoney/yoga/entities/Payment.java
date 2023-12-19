package com.flexmoney.yoga.entities;

import jakarta.persistence.*;


@Entity
public class Payment  {


    @Id
    @Column(name = "payId",length = 500)
    public String payId;


    @Column(name = "email",length = 50)
    public String email;

    //@Id
    @Column(name = "batch",length = 50)
    public String batch;

    //@Id
    @Column(name = "year",length = 5)
    public String year;

    //@Id
    @Column(name = "month",length = 5)
    public String month;
}
