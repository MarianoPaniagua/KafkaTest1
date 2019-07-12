package com.pani.KafkaTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public static final String KAFKA_TOPIC = "marian";

	public void send(String message) {

		kafkaTemplate.send(KAFKA_TOPIC, message);
	}
}
