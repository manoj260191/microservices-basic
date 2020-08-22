package com.demo.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.aggregator.model.AggregatedModel;
import com.demo.aggregator.service.AggregatorService;

@RestController
public class AggregatorController {

	@Autowired
	private AggregatorService aggregatorService;

	@GetMapping("/orderdetails/{userId}")
	public ResponseEntity<?> getOrderDetailsByUserId(@PathVariable(value = "userId") int userId) {

		AggregatedModel aggregatedModel = aggregatorService.getUserOrderByUserId(userId);
		return new ResponseEntity<>(aggregatedModel, HttpStatus.FOUND);
	}

}
