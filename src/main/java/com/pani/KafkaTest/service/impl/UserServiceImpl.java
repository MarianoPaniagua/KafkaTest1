package com.pani.KafkaTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pani.KafkaTest.entity.User;
import com.pani.KafkaTest.converter.UserConverter;
import com.pani.KafkaTest.dto.UserDto;
import com.pani.KafkaTest.repositoriy.UserRepositoryHibernate;
import com.pani.KafkaTest.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userRepositoryHibernate")
	private UserRepositoryHibernate userRepositoryHibernate;
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter userConverter;
	
	@Override
	public User addUser(UserDto userDto) {
		User user = userConverter.dtoToEntity(userDto);
		userRepositoryHibernate.save(user);
		return user;
	}

	@Override
	public User findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
