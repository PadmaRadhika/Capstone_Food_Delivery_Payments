package com.example.fooddeliverypayments.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class Order {
	private Integer id;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private Double totalAmount;
	private Date orderDate;	
    private List<OrderItem> items = new ArrayList<>();

}
