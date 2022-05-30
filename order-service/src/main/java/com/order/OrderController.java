package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping("order") //end point
	void createOrder(@RequestBody OrderVO order) {
		service.saveOrder(order);
		
		System.out.println(order.getItem());
		System.out.println(order.getQuantity());
	}
}
