package com.niczo.simple.serialize;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestSerialize {

	public static void main(String[] args) throws IOException {
		User l = createUser();
		//testFastjson(l);
		testJackson(l);

	}


	private static User createUser() {
		User l = new User();
		l.setName("lhc");
		l.setAge(26);
		List<Child> children = new ArrayList<>();
		Child first = new Child();
		first.setName("first");
		first.setAge(5);

		Child second = new Child();
		second.setName("second");
		second.setAge(4);

		children.add(first);
		children.add(second);

		l.setChildren(children);
		return l;
	}

	private static void testJackson(User l) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(l);
		System.out.println(json);

		User user = mapper.readValue(json, User.class);
		System.out.println(user.getChildren().get(0).getName());
	}

	private static void testFastjson(User l) {
		String json = JSON.toJSONString(l);
		System.out.println(json);

		User user = JSON.parseObject(json, User.class);
		System.out.println(user.getChildren().get(0).getName());
	}
}
