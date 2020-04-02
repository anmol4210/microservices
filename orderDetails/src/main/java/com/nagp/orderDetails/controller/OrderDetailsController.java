package com.nagp.orderDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.orderDetails.dto.OrderDetailsDto;
import com.nagp.orderDetails.dto.Response;
import com.nagp.orderDetails.service.OrderDetailsService;

@RestController
@RequestMapping(value = "/orderdetails")
public class OrderDetailsController {
	
	@Autowired 
	private OrderDetailsService orderServiceDetails;
	
	@GetMapping(value = "/{userId}")
	Response<OrderDetailsDto> getUserOrderDetails(@PathVariable String userId){
		return orderServiceDetails.getUserOrderDetails(userId);
	}
}
