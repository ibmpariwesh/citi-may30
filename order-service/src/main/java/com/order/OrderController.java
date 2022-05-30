package com.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@PostMapping("order") //end point
	void createOrder(@RequestBody OrderVO order) {
		System.out.println(order.getItem());
	}
}
