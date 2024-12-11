package com.example.fooddeliverypayments.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.fooddeliverypayments.model.Order;


@FeignClient(name="FOODDELIVERYORDERS", url= "http://ec2-35-171-160-2.compute-1.amazonaws.com:8084/api/orders")
public interface FeignService {
	@PutMapping("update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order updateData);
}
