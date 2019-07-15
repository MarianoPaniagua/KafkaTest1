package com.pani.KafkaTest.repositoriy;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pani.KafkaTest.entity.User;

@Repository("userRepositoryHibernate")
public interface UserRepositoryHibernate extends JpaRepository<User, Serializable> {

	public abstract User findByUserId(Long userId);

}
