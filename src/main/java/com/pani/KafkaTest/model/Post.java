package com.pani.KafkaTest.model;

public class Post {

	private String message;

	private Long senderId;

	private String topic;

	public Post() {
	}

	public Post(String message, Long senderId, String topic) {
		super();
		this.message = message;
		this.senderId = senderId;
		this.topic = topic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Post [message=" + message + ", senderId=" + senderId + ", topic=" + topic + "]";
	};

	
}
