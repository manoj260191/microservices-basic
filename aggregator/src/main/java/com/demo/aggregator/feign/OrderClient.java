package com.demo.aggregator.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.aggregator.circuitbreaker.OrderClientFallback;
import com.demo.aggregator.model.Order;

@FeignClient(name = "orderService", fallback= OrderClientFallback.class)
public interface OrderClient {

	@GetMapping("/orders/{userId}")
	public List<Order> getOrderByUserId(@PathVariable(value = "userId") int id);
}
