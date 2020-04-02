package com.nagp.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.order.dto.OrderDto;
import com.nagp.order.dto.Response;
import com.nagp.order.service.OrderService;


@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/{userId}")
	Response<List<OrderDto>> getUserOrders(@PathVariable String userId){
		
		return orderService.getUserOrders(userId);
	}
	
}
