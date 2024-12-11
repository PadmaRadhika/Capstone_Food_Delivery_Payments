package com.example.fooddeliverypayments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooddeliverypayments.dao.PaymentRepository;
import com.example.fooddeliverypayments.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment createPayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
	}
	
}
