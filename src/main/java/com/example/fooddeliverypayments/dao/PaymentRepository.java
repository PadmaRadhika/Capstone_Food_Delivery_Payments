package com.example.fooddeliverypayments.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fooddeliverypayments.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
