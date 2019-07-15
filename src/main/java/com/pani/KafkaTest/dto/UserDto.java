package com.pani.KafkaTest.dto;

public class UserDto {

	private String name;
	private String lastName;
	private Long userId;

	public UserDto() {
	}

	public UserDto(String name, String lastName, Long userId) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
