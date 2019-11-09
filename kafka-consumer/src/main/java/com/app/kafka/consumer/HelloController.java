package com.app.kafka.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private KafkaConsumer kafkaConsumer;
	
	HelloController(KafkaConsumer kafkaConsumer){
		this.kafkaConsumer=kafkaConsumer;
	}
	
	
	@GetMapping("/rest")
	public void readMessage() {
		
	}

}
