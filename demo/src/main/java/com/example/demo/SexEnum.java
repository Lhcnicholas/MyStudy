package com.example.demo;

public enum SexEnum {

	MALE("MALE", "男性"),

	FEMALE("FEMALE", "女性");

	private final String key;

	private final String value;

	SexEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SexEnum{" +
				"key='" + key + '\'' +
				", value='" + value + '\'' +
				"} " + super.toString();
	}
}
