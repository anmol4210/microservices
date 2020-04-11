package com.nagp.user.services.impl;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.user.dto.Response;
import com.nagp.user.dto.UserDto;
import com.nagp.user.entities.User;
import com.nagp.user.repostories.UserRepository;
import com.nagp.user.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserRepository userRepository;
	
	@Override
	public Response<UserDto> getUser(String userId) {
		
		
		boolean isValidId = Pattern.matches("[0-9]+", userId);
		Response<UserDto> response = new Response<UserDto>();
		
		if(!isValidId) {
//			ProductsApplication.log.info("Enter valid User Id  " + userId);
//			Response<UserDto> response = new Response<UserDto>();
			response.setStatus(204);
			response.setMessage("Enter valid User Id");
			return response;
		}
		
		int searchId = Integer.parseInt(userId);
		
		User user = userRepository.search(searchId);
		UserDto userDto = new UserDto();
		
		
		if (user!=null) {
		userDto.setAge(user.getAge());
		userDto.setEmail(user.getEmail());
		userDto.setName(user.getName());
		
		}
		else {
			response.setMessage("User does not exists!");
		}
		
		response.setData(userDto);
		response.setStatus(200);
		
		return response;
	}

	@Override
	public Response<UserDto> addUser(UserDto userDto) {
		
		User user = new User();
		user.setAge(userDto.getAge());
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		
		User newUser = userRepository.save(user);
		
		UserDto responseUserDto = new UserDto();
		responseUserDto.setAge(newUser.getAge());
		responseUserDto.setName(newUser.getName());
		responseUserDto.setEmail(newUser.getEmail());
		
		Response<UserDto> response = new Response<UserDto>();
		response.setStatus(200);
		response.setData(responseUserDto);
		
		return response;
	}

}
