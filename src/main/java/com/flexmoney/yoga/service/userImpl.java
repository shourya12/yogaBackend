package com.flexmoney.yoga.service;

import com.flexmoney.yoga.entities.Users;
import org.apache.catalina.User;

public interface userImpl {

    public void saveUser(Users user);

    public Users findByuser(String name);
}
