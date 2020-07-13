package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAspect() {
		User user = new User();
		user.setName("李鸿程");
		user.setSex("male");
		user.setAge(18);
		userService.insertUser(user);
	}

}
