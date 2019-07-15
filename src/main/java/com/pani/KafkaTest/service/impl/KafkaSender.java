package com.pani.KafkaTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.pani.KafkaTest.entity.Post;

@Service
public class KafkaSender {

	
	private KafkaTemplate<String, Long> userPostingNotificationTemplate;
	
	private KafkaTemplate<String, Post> postMadeAndSavedInATopic;

	public static final String POST_DONE_BY_USER = "posts_done_by_user";
	
	@Autowired
	public KafkaSender(KafkaTemplate<String, Post> postMadeAndSavedInATopic, KafkaTemplate<String, Long> userPostingNotificationTemplate) {
		this.postMadeAndSavedInATopic = postMadeAndSavedInATopic;
		this.userPostingNotificationTemplate = userPostingNotificationTemplate;
	}
	
	public void sendUserPostingNotification(Long userId) {

		userPostingNotificationTemplate.send(POST_DONE_BY_USER, userId);
	}

	public void sendPost(String topic, Post post) {
		postMadeAndSavedInATopic.send(topic, post);
	}
}
