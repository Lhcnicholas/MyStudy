package com.niczo.dubbo.service.impl;

import com.niczo.dubbo.service.UserService;
import com.niczo.dubbo.service.dto.UserDto;
import com.niczo.dubbo.service.mapper.UserMapper;
import com.niczo.dubbo.service.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@DubboService(version = "0.0.1", validation = "true")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(UserDto user) {
		User user1 = new User();
		BeanUtils.copyProperties(user, user1);

		userMapper.insertSelective(user1);
	}

	@Override
	public UserDto getUser(Integer id) {
		User user = userMapper.selectById(id);
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);
		return userDto;
	}


}
