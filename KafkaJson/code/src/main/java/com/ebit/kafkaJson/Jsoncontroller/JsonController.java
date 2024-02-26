package com.ebit.kafkaJson.Jsoncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.kafkaJson.Jsonproducer.JsonProducer;
import com.ebit.kafkaJson.model.User;

@RestController
public class JsonController {
	
	@Autowired
	private JsonProducer producer;
	
	@PostMapping("/message")
	public String sendMessage(@RequestBody User user) {
		producer.sendMessage(user);
		return "Message sent";
	}

}
