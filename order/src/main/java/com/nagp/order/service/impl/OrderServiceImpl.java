package com.nagp.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagp.order.dto.OrderDto;
import com.nagp.order.dto.Response;
import com.nagp.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public Response<List<OrderDto>> getUserOrders(String userId) {
		List<OrderDto> orderList = new ArrayList<OrderDto>();
		orderList.add(new OrderDto("14-Apr-2020","250","1"));
		orderList.add(new OrderDto("15-Apr-2020","450","2"));
		Response <List<OrderDto>> response = new Response<List<OrderDto>>();
		response.setData(orderList);
		response.setStatus(200);
		return response;
	}

}
