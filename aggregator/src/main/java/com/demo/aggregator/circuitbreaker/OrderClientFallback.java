package com.demo.aggregator.circuitbreaker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.demo.aggregator.feign.OrderClient;
import com.demo.aggregator.model.Order;

@Component
public class OrderClientFallback implements OrderClient {

	@Override
	public List<Order> getOrderByUserId(int id) {
		// TODO Auto-generated method stub
		List<Order> orders = new ArrayList<>();

		orders.add(new Order(1, 250, LocalDate.now(), 1));
		orders.add(new Order(2, 250, LocalDate.now().minusDays(1), 1));
		orders.add(new Order(1, 450, LocalDate.now().minusDays(2), 2));

		return orders.stream().filter(order -> order.getUserId() == 1).collect(Collectors.toList());
	}

}
