package com.demo.order.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.order.model.Order;

@Service
public class OrderService {

	private List<Order> orders;

	List<Order> initializeOrders() {

		orders = new ArrayList<>();

		orders.add(new Order(1, 250, LocalDate.now(), 1));
		orders.add(new Order(2, 250, LocalDate.now().minusDays(1), 1));
		orders.add(new Order(1, 450, LocalDate.now().minusDays(2), 2));
		orders.add(new Order(2, 250, LocalDate.now().minusDays(3), 2));
		orders.add(new Order(3, 450, LocalDate.now().minusDays(4), 4));
		orders.add(new Order(4, 700, LocalDate.now().minusDays(5), 5));
		orders.add(new Order(1, 1000, LocalDate.now().minusDays(6), 5));
		orders.add(new Order(1, 2000, LocalDate.now().minusDays(7), 6));

		return orders;
	}

	public List<Order> getOrderByUserId(int id) {
		initializeOrders();
		return orders.stream().filter(order -> order.getUserId() == id).collect(Collectors.toList());
	}

}
