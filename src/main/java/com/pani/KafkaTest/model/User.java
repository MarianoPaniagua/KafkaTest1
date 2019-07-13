package com.pani.KafkaTest.model;

public class User {

	private String name;

	private String age;

	private Long userId;

	public User() {
	}

	public User(String name, String age, Long userId) {
		super();
		this.name = name;
		this.age = age;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
