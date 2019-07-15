package com.pani.KafkaTest.service;

import com.pani.KafkaTest.dto.UserDto;
import com.pani.KafkaTest.entity.User;

public interface UserService {

	public abstract User addUser(UserDto userDto);

	public abstract User findByUserId(Long userId);
}
