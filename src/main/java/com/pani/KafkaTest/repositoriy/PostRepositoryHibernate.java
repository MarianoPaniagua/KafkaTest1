package com.pani.KafkaTest.repositoriy;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pani.KafkaTest.entity.Post;

@Repository("postRepositoryHibernate")
public interface PostRepositoryHibernate extends JpaRepository<Post, Serializable> {

}
