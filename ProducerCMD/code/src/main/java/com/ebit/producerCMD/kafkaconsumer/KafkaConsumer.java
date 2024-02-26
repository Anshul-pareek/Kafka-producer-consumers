package com.ebit.producerCMD.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ebit.producerCMD.model.User;


@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = "topic", groupId = "myGroup")
	public void consume(String message) {
		System.out.println(message);
	}

}

