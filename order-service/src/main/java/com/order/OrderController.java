package com.order;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController extends BaseController {
	@Autowired
	OrderService service;

	@PostMapping("order") // end point
	@ResponseStatus(code = HttpStatus.CREATED)
	void createOrder(@Valid @RequestBody OrderVO order) {
		service.saveOrder(order);

		System.out.println(order.getItem());
		System.out.println(order.getQuantity());
	}

	@GetMapping("order")
	public List<OrderVO> getOrders() {
		return service.getOrders();
	}
}
