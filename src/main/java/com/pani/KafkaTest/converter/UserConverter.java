package com.pani.KafkaTest.converter;

import org.springframework.stereotype.Component;

import com.pani.KafkaTest.dto.UserDto;
import com.pani.KafkaTest.entity.User;

@Component("userConverter")
public class UserConverter {

	// Entity ---> Dto

	public UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setLastName(user.getLastName());
		userDto.setName(user.getName());
		userDto.setUserId(user.getUserId());

		return userDto;
	}

	// Dto ---> Entity

	public User dtoToEntity(UserDto userDto) {
		User user = new User();
		user.setUserId(userDto.getUserId());
		user.setName(userDto.getName());
		user.setLastName(userDto.getLastName());

		return user;
	}
}
