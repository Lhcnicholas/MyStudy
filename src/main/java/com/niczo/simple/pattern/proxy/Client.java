package com.niczo.simple.pattern.proxy;

import com.niczo.simple.pattern.GamePlayer;
import com.niczo.simple.pattern.IGamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

/**
 * @author lhc
 */
public class Client {

	private static final Logger log = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {

		IGamePlayer gamePlayer = new GamePlayer("张三");

		GamePlayerIh handler = new GamePlayerIh(gamePlayer);

		log.info("开始时间是:2019-03-15 14:00:00");

		ClassLoader cl = gamePlayer.getClass().getClassLoader();

		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

		proxy.login("张三","123456");

		proxy.killBoss();

		proxy.upgrade();

		log.info("结束时间是:2019-03-15 18:00:00");
	}
}
