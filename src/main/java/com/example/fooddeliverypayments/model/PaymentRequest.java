package com.example.fooddeliverypayments.model;

import lombok.Data;

@Data
public class PaymentRequest {
	private Payment payment;
	private Order order;
}
