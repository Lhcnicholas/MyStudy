package com.niczo.dubbo.service;

import com.niczo.dubbo.service.dto.UserDto;

public interface UserService {

	void addUser(UserDto user);

	UserDto getUser(Integer id);
}
