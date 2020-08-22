package com.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.user.model.User;
import com.demo.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable(value = "id") int id) {

		User user = userService.getUser(id);
		//return new ResponseEntity<User>(user, HttpStatus.FOUND);
		return user;
	}
}
