package com.niczo.Simple.Pattern.ProxyPattern;

import com.niczo.Simple.Pattern.GamePlayer;
import com.niczo.Simple.Pattern.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		IGamePlayer gamePlayer = new GamePlayer("张三");

		InvocationHandler handler = new GamePlayerIH(gamePlayer);

		System.out.println("开始时间是:2019-03-15 14:00:00");

		ClassLoader cl = gamePlayer.getClass().getClassLoader();

		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

		proxy.login("张三","123456");

		proxy.killBoss();

		proxy.upgrade();

		System.out.println("结束时间是:2019-03-15 18:00:00");
	}
}
