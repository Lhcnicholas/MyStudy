package com.niczo.dubbo.service.impl;

import com.niczo.dubbo.service.UserService;
import com.niczo.dubbo.service.dto.UserDto;
import com.niczo.dubbo.service.mapper.UserMapper;
import com.niczo.dubbo.service.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@org.apache.dubbo.config.annotation.Service(version = "0.0.1")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(UserDto user) {
		User user1 = new User();
		BeanUtils.copyProperties(user, user1);

		userMapper.insert(user1);
	}
}
