package com.nagp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.user.dto.Response;
import com.nagp.user.dto.UserDto;
import com.nagp.user.repostories.UserRepository;
import com.nagp.user.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	
	@GetMapping(value = "/{userId}")
	Response<UserDto> getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping(path="/add")
	Response<UserDto> addUser(@RequestBody UserDto userDto){
		return userService.addUser(userDto);
	}
}
