package com.flexmoney.yoga.entities;


public class Candicate {

    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Candicate(String username, String password) {
        this.email = username;
        this.password = password;
    }
}
