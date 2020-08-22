package com.demo.order.model;

import java.time.LocalDate;

public class Order {

	private int orderId;
	private double orderAmount;
	private LocalDate orderDate;
	private int userId;
	
	public Order() {
		
	}
	
	public Order(int orderId, double orderAmount, LocalDate orderDate, int userId) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.userId = userId;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
