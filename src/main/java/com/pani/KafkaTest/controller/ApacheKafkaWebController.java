package com.pani.KafkaTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pani.KafkaTest.converter.PostConverter;
import com.pani.KafkaTest.dto.PostDto;
import com.pani.KafkaTest.dto.UserDto;
import com.pani.KafkaTest.entity.Post;
import com.pani.KafkaTest.entity.User;
import com.pani.KafkaTest.service.PostService;
import com.pani.KafkaTest.service.UserService;
import com.pani.KafkaTest.service.impl.KafkaSender;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@Autowired
	UserService userService;

	@Autowired
	PostService postService;

	@Autowired
	PostConverter postConverter;

	@PostMapping(value = "/post")
	public String producer(@RequestBody Post post) {
		String topic = post.getTopic();
		// just to tes, need to only be a dto
		PostDto postDto = postConverter.entityToDto(post);
		kafkaSender.sendPost(topic, post);
		postService.addPost(postDto);
		kafkaSender.sendUserPostingNotification(post.getSenderId());

		return "Post sent to the Kafka Topic: '" + topic + "' Successfully";
	}

	@KafkaListener(topics = "java_topic")
	public void getPostFor__java_topic(Post post) {
		System.out.println(post.toString());
	}
}
