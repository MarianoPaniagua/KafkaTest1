package com.pani.KafkaTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserBasicInfo")
public class User {
	
	@Column 
	private String name;

	private String mail;

	private String age;
	@Column 
	private String lastName;

	@Id
	@GeneratedValue
	private Long userId;

	public User() {
	}

	public User(String name, String age, Long userId, String mail, String lastName) {
		super();
		this.name = name;
		this.age = age;
		this.userId = userId;
		this.mail = mail;
		this.lastName = lastName;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
