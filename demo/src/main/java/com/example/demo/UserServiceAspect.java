package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lhc
 */
@Aspect
@Component
@Slf4j
public class UserServiceAspect {

	@Before(value = "pointcut(user)", argNames = "user")
	public void beforeInsert(User user) {
		log.info("开始插入,userName:{}", user.getName());
	}

	@After(value = "pointcut(user)", argNames = "user")
	public void afterInsert(User user) {
		log.info("结束插入,userName:{}", user.getName());
	}

	@AfterReturning(value = "pointcut(user)")
	public void afterReturning(User user) {
		log.info("插入返回结果,userName:{}", user.getName());
	}

	@AfterThrowing(value = "pointcut(user)")
	public void afterThrowing(User user) {
		log.info("插入报错,userName:{}", user.getName());
	}

	@Pointcut("execution(* UserService.insertUser(..)) && args(user)")
	public void pointcut(User user) {

	}
}
