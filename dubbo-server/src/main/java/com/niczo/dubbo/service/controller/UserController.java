package com.niczo.dubbo.service.controller;

import com.niczo.dubbo.service.UserService;
import com.niczo.dubbo.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("get")
	public String get(Integer id) {
		UserDto user = userService.getUser(id);
		return user.getName();
	}

	@PostMapping("new")
	public String insert(@RequestBody UserDto userDto) {
		userService.addUser(userDto);
		return "成功";
	}
}
