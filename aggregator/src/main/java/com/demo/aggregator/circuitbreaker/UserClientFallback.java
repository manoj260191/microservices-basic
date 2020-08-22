package com.demo.aggregator.circuitbreaker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.aggregator.feign.UserClient;
import com.demo.aggregator.model.User;

@Component
public class UserClientFallback implements UserClient {

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		List<User> user = new ArrayList<>();
		user.add(new User("Manoj", 29, "manoj260191@gmail.com", 1));
		user.add(new User("Suraj", 23, "suraj260191@gmail.com", 2));

		return user.get(0);
	}

}
