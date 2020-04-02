package com.nagp.orderDetails.service;

import com.nagp.orderDetails.dto.OrderDetailsDto;
import com.nagp.orderDetails.dto.Response;

public interface OrderDetailsService {
	
	Response<OrderDetailsDto> getUserOrderDetails(String userId);
}
