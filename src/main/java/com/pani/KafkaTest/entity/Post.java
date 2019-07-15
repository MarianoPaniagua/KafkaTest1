package com.pani.KafkaTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PostBasicInfo")
public class Post {

	@Id
	@GeneratedValue
	private Long postId;

	@Column
	private String message;
	@Column
	private Long senderId;
	@Column
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
