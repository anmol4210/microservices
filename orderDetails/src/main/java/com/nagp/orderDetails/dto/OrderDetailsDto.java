package com.nagp.orderDetails.dto;

import java.util.List;

public class OrderDetailsDto {

	private UserDto userDetails;
	private List<OrderDto> orders;
	public UserDto getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDto userDetails) {
		this.userDetails = userDetails;
	}
	public List<OrderDto> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDto> orders) {
		this.orders = orders;
	}
	
	public OrderDetailsDto() {}
	
	public OrderDetailsDto(UserDto userDto, List<OrderDto> orderDtoList) {
		this.userDetails = userDto;
		this.orders = orderDtoList;
	}
}
