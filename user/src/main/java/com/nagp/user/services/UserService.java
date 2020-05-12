package com.nagp.user.services;

import com.nagp.user.dto.Response;
import com.nagp.user.dto.UserDto;

public interface UserService {
	Response<UserDto> getUser(String userId);
	Response<UserDto> addUser(UserDto userDto);
}
