package com.niczo.springsessiion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("session")
@Slf4j
public class SessionController {

	private final RedisTemplate<Object,Object> redisTemplate;

	public SessionController(RedisTemplate<Object, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}


	@GetMapping("get")
	public String get(@RequestParam String code) {
		return Objects.requireNonNull(redisTemplate.opsForValue().get(code)).toString();
	}
}
