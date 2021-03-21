package com.niczo.simple.serialize;

import java.util.List;

public class User {

	private String name;

	private Integer age;

	private List<Child> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(Object children) {
		this.children = (List)children;
	}
}
