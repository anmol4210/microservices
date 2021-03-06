package com.nagp.order.service;

import java.util.List;

import com.nagp.order.dto.OrderDto;
import com.nagp.order.dto.Response;

public interface OrderService {
	
	Response<List<OrderDto>> getUserOrders(String userId);
}
