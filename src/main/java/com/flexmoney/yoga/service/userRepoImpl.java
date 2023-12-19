package com.flexmoney.yoga.service;

import com.flexmoney.yoga.entities.Users;
import com.flexmoney.yoga.repository.userRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userRepoImpl implements userImpl{

    @Autowired
    userRepository userrepository;

    @Override
    public void saveUser(Users user) {
        userrepository.save(user);


    }

    @Override
    public Users findByuser(String name) {
        return userrepository.findByEmail(name);
    }
}
