package com.flexmoney.yoga.controllers;

import com.flexmoney.yoga.entities.Candicate;
import com.flexmoney.yoga.entities.Payment;
import com.flexmoney.yoga.entities.Users;
import com.flexmoney.yoga.entities.Validation;
import com.flexmoney.yoga.service.payemtRepoImpl;
import com.flexmoney.yoga.service.userRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@CrossOrigin
@RestController
public class controller {

    @Autowired
    userRepoImpl userRepo;

    @Autowired
    payemtRepoImpl payemtRepo;

    Random random;

    @PostMapping("/api/register")
    public Validation createUser(@RequestBody Users user)
    {
        user.Id= UUID.randomUUID().toString();
        Validation val = new Validation();
        Users users=userRepo.findByuser(user.email);
        if(users!=null)
        {
            val.setUser(true);

        }else {

            val.setUser(false);
            userRepo.saveUser(user);
        }

        return val;
    }

    @PostMapping("/api/signin")
    public Users signIn(@RequestBody Candicate candicate)
    {
        Users user=userRepo.findByuser(candicate.getEmail());
        if(user!=null && user.password.equals(candicate.getPassword()))
        {
            return user;
        }else {

            return null;
        }
    }

    @PostMapping("/api/pay")
    public Validation completePayment(@RequestBody Payment payment)
    {
        payment.payId=UUID.randomUUID().toString();
        Validation val = new Validation();
        if(userRepo.findByuser(payment.email)==null)
        {
            val.setUser(false);
            return val;
        }else {
            val.setUser(true);
        }

        if(payemtRepo.findBydetails(payment)!=null)
        {
            val.setCheck(true);

            return val;
        }else {
            val.setCheck(false);
        }
        payemtRepo.savePayment(payment);
        return val;
    }






}
