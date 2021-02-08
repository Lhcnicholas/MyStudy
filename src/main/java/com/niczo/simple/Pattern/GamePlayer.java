package com.niczo.simple.Pattern;

public class GamePlayer implements IGamePlayer {

	private  String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String name, String password) {
		System.out.printf("登录成功,用户%s,密码%s\n", name, password);
	}

	@Override
	public void killBoss() {
		System.out.println("杀掉BOSS了");
	}

	@Override
	public void upgrade() {
		System.out.println("升级啦");
	}
}
