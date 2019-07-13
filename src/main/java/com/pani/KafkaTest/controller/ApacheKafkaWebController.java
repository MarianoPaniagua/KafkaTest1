package com.pani.KafkaTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pani.KafkaTest.model.Post;
import com.pani.KafkaTest.service.KafkaSender;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@PostMapping(value = "/post")
	public String producer(@RequestBody Post post) {
		String topic = post.getTopic();
		kafkaSender.sendPost(topic, post);
		kafkaSender.sendUserPostingNotification(post.getSenderId());
		return "Post sent to the Kafka Topic: '" + topic + "' Successfully";
	}
}
