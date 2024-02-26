package com.ebit.kafkaJson.Jsonproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.ebit.kafkaJson.model.User;

@Service
public class JsonProducer {
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	public void sendMessage(User user) {
		
		Message<User> message = MessageBuilder
				.withPayload(user)
				.setHeader(KafkaHeaders.TOPIC, "pareek")
				.build();
		
		kafkaTemplate.send(message);
	}

}
