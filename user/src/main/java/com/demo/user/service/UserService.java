package com.demo.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.user.model.User;

@Service
public class UserService {

	private List<User> user;

	public User getUser(int id) {
		createUser();
		return user.stream().filter(user -> user.getId() == id).collect(Collectors.toList()).get(0);
	}

	public List<User> createUser() {
		user = new ArrayList<>();
		user.add(new User("Manoj", 29, "manoj260191@gmail.com", 1));
		user.add(new User("Suraj", 23, "suraj260191@gmail.com", 2));
		user.add(new User("Anuj", 28, "anuj260191@gmail.com", 3));
		user.add(new User("Atul", 27, "atul260191@gmail.com", 4));
		user.add(new User("Pooja", 29, "pooja260191@gmail.com", 5));
		user.add(new User("Mom", 49, "mom260191@gmail.com", 6));

		return user;

	}
}
