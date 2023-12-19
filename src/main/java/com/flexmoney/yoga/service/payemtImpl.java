package com.flexmoney.yoga.service;

import com.flexmoney.yoga.entities.Payment;

public interface payemtImpl {

    public void savePayment(Payment payment);

    public Payment findBydetails(Payment payment);
}
