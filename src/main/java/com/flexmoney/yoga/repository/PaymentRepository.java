package com.flexmoney.yoga.repository;

import com.flexmoney.yoga.entities.Payment;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

    @Query("SELECT p FROM Payment p WHERE p.batch = :batch AND p.email = :email AND p.month = :month AND p.year = :year")
    public Payment validationQuery(@Param("batch") String batch, @Param("email") String email,
                                         @Param("month") String month, @Param("year") String year);

}
