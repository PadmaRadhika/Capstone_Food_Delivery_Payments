package com.example.fooddeliverypayments.model;

import lombok.Data;

@Data
public class OrderItem {
	private Integer id;	
    private Order order;
	private Integer dishId;
	private Integer quantity;
}
