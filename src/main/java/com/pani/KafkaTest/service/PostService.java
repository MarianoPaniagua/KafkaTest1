package com.pani.KafkaTest.service;

import com.pani.KafkaTest.dto.PostDto;
import com.pani.KafkaTest.entity.Post;

public interface PostService {

	public abstract Post addPost(PostDto postDto);

	public abstract Post findByPostId(Long postId);

}
