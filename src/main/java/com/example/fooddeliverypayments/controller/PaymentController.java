package com.example.fooddeliverypayments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddeliverypayments.config.FeignService;
import com.example.fooddeliverypayments.model.Order;
import com.example.fooddeliverypayments.model.Payment;
import com.example.fooddeliverypayments.model.PaymentRequest;
import com.example.fooddeliverypayments.service.PaymentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow CORS from Angular app
@RequestMapping(value = "/api/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private FeignService feignService;
	
	@PostMapping("/makePayment")
    public ResponseEntity<Payment> makePayment(@RequestBody PaymentRequest paymentRequest) {
		Payment payment = paymentRequest.getPayment();		
		Order order = paymentRequest.getOrder();		
		Payment createdPayment = paymentService.createPayment(payment);
		//Update order with customer info
		ResponseEntity<Order> response = feignService.updateOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
