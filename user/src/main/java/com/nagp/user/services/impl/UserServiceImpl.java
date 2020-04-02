package com.nagp.user.services.impl;

import org.springframework.stereotype.Service;

import com.nagp.user.dto.Response;
import com.nagp.user.dto.UserDto;
import com.nagp.user.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public Response<UserDto> getUser(String userId) {
		UserDto userDto = new UserDto();
		Response<UserDto> response = new Response<UserDto>();
		response.setData(userDto);
		response.setStatus(200);
		return response;
	}

}