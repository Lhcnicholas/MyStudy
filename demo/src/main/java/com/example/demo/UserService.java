package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lhc
 */
@Service
@Slf4j
public class UserService {

	public void insertUser(User user) {
		log.info("添加用户");
		throw new RuntimeException();
	}
}
