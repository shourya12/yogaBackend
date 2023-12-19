package com.flexmoney.yoga.repository;

import com.flexmoney.yoga.entities.Users;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<Users,String> {

    Users findByEmail(String email);



}
