package com.app.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "example",groupId = "group_id")
	public void consume(String message) {
		log.info(message);
	}

}
