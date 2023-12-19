package com.flexmoney.yoga.service;

import com.flexmoney.yoga.entities.Payment;
import com.flexmoney.yoga.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class payemtRepoImpl implements payemtImpl{

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public void savePayment(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public Payment findBydetails(Payment payment) {

        return paymentRepository.validationQuery(payment.batch,payment.email,payment.month,payment.year);

    }
}
