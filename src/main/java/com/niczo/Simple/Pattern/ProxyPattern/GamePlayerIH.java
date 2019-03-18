package com.niczo.Simple.Pattern.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

	Class cls = null;

	Object obj = null;

	public GamePlayerIH(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object result = method.invoke(this.obj, args);
		return result;
	}
}
