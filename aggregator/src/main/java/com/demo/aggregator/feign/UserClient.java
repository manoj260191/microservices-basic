package com.demo.aggregator.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.aggregator.circuitbreaker.UserClientFallback;
import com.demo.aggregator.model.User;

@FeignClient(name = "userService", fallback = UserClientFallback.class)
public interface UserClient {

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable(value = "id") int id);

}
