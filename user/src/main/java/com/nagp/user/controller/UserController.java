package com.nagp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.user.dto.Response;
import com.nagp.user.dto.UserDto;
import com.nagp.user.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService getUser;
	
	@GetMapping(value = "/{userId}")
	Response<UserDto> changeOrderStaus(@PathVariable String userId) {
		return getUser.getUser(userId);
	}
}