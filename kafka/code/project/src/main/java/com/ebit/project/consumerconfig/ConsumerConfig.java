package com.ebit.project.consumerconfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerConfig {

	@KafkaListener(topics = "user-topic", groupId = "myGroup")
	public void consumer(String message) {
		System.out.println("Message Recieved: "+ message);
	}
}
