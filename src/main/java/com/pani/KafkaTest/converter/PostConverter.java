package com.pani.KafkaTest.converter;

import org.springframework.stereotype.Component;

import com.pani.KafkaTest.dto.PostDto;
import com.pani.KafkaTest.entity.Post;

@Component("postConverter")
public class PostConverter {

	// Entity ---> Dto

	public PostDto entityToDto(Post post) {
		PostDto postDto = new PostDto();
		postDto.setMessage(post.getMessage());
		postDto.setSenderId(post.getSenderId());
		postDto.setTopic(post.getTopic());

		return postDto;
	}

	// Dto ---> Entity

	public Post dtoToEntity(PostDto postDto) {
		Post post = new Post();
		post.setMessage(postDto.getMessage());
		post.setSenderId(postDto.getSenderId());
		post.setTopic(postDto.getTopic());

		return post;
	}

}
