package com.demo.aggregator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.aggregator.feign.OrderClient;
import com.demo.aggregator.feign.UserClient;
import com.demo.aggregator.model.AggregatedModel;
import com.demo.aggregator.model.Order;
import com.demo.aggregator.model.User;

@Service
public class AggregatorService {

	@Autowired
	private OrderClient orderClient;

	@Autowired
	private UserClient userClient;

	public AggregatedModel getUserOrderByUserId(int userId) {

		AggregatedModel aggregatedModel = new AggregatedModel();

		User user = userClient.getUser(userId);
		List<Order> orders = orderClient.getOrderByUserId(userId);

		if (user != null) {
			aggregatedModel.setUser(user);
			aggregatedModel.setOrders(orders);
		}

		return aggregatedModel;
	}

}
