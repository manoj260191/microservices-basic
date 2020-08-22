package com.demo.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.order.model.Order;
import com.demo.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders/{userId}")
	public List<Order> getOrderByUserId(@PathVariable(value = "userId") int userId) {

		List<Order> orders = orderService.getOrderByUserId(userId);
		// return new ResponseEntity<>(orders, HttpStatus.FOUND);
		return orders;
	}

}
