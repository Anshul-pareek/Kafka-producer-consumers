package com.ebit.kafkaJson.Jsonconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ebit.kafkaJson.model.User;

@Service
public class JsonConsumer {
	
	@KafkaListener(topics = "pareek", groupId = "myGroup")
	public void consume(User user) {
		System.out.println(user.toString());
	}

}
