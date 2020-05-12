package com.nagp.orderDetails.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagp.orderDetails.dto.OrderDetailsDto;
import com.nagp.orderDetails.dto.OrderDto;
import com.nagp.orderDetails.dto.Response;
import com.nagp.orderDetails.dto.UserDto;
import com.nagp.orderDetails.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

	@Resource
	private RestTemplate restTemplate;
	
	@Override
	public Response<OrderDetailsDto> getUserOrderDetails(String userId) {
		
		RestTemplate restTemplate = new RestTemplate();
//		System.out.println(System.getenv("ES_HOME"));
//		System.out.println(System.getenv("OneDrive"));
//		System.getenv(String name);
		String orderUrl = System.getenv("order_path")+userId;
		Response<List<OrderDto>> orderResponse = new Response<List<OrderDto>>();
		ResponseEntity<Response<List<OrderDto>>> orderResponseEntity = null;
		
		String userUrl = System.getenv("user_path")+userId;
		Response<UserDto> userResponse = new Response<UserDto>();
		ResponseEntity<Response<UserDto>> userResponseEntity = null;
		UriComponentsBuilder builder = null;
			
		builder = UriComponentsBuilder.fromUriString(userUrl);		
		userResponseEntity = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null,new ParameterizedTypeReference<Response<UserDto>>() {});
		userResponse = userResponseEntity.getBody();
	
		builder = UriComponentsBuilder.fromUriString(orderUrl);		
		orderResponseEntity = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null,new ParameterizedTypeReference<Response<List<OrderDto>>>() {});
		orderResponse = orderResponseEntity.getBody();
		
		
		OrderDetailsDto ordetDetailsDto = new OrderDetailsDto();
		ordetDetailsDto.setUserDetails(userResponse.getData());
		ordetDetailsDto.setOrders(orderResponse.getData());
		Response<OrderDetailsDto> response = new Response<OrderDetailsDto>();
		response.setData(ordetDetailsDto);
		
		response.setStatus(200);
		
		return response;
	}

}
