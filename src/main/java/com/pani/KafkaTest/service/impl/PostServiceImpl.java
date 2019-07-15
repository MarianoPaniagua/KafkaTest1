package com.pani.KafkaTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pani.KafkaTest.converter.PostConverter;
import com.pani.KafkaTest.dto.PostDto;
import com.pani.KafkaTest.entity.Post;
import com.pani.KafkaTest.repositoriy.PostRepositoryHibernate;
import com.pani.KafkaTest.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	@Qualifier("postRepositoryHibernate")
	private PostRepositoryHibernate postRepositoryHibernate;
	
	@Autowired
	@Qualifier("postConverter")
	private PostConverter postConverter;

	@Override
	public Post addPost(PostDto postDto) {
		Post post = postConverter.dtoToEntity(postDto);
		postRepositoryHibernate.save(post);
		return post;
	}

	@Override
	public Post findByPostId(Long postId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
