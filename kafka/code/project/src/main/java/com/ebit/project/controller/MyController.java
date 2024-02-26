package com.ebit.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.project.producerconfig.ProducerConfig;

@RestController
public class MyController {

	@Autowired
	private ProducerConfig producer;

	@GetMapping("/{message}")
	public String publish(@PathVariable String message) {
		producer.sendMessage(message);
		return ("message sent to topic");
	}

}
