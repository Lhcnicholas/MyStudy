package com.niczo.simple.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIh implements InvocationHandler {

	private static final Logger log = LoggerFactory.getLogger(GamePlayerIh.class);

	Object obj;

	public GamePlayerIh(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.info("{} 开始", method.getName());
		Object result = method.invoke(this.obj, args);
		log.info("{} 结束", method.getName());
		return result;
	}
}
