package com.nagp.orderDetails.dto;

public class OrderDto {
	private String orderId;
	private String orderDate;
	private String orderAmount;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public OrderDto() {}
	public OrderDto(String date,String amount,String id) {
		this.orderDate = date;
		this.orderAmount = amount;
		this.orderId = id;
	}
}
