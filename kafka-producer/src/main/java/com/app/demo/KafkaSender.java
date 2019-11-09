package com.app.demo;

import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaSender {

    @Value("${kafka.topic.json}")
    private String topic;

    private KafkaTemplate<String,User> kafkaTemplate;

    KafkaSender(KafkaTemplate<String,User> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendData(Object obj){
        Map<String,Object> headers=new HashMap<>();
        headers.put(KafkaHeaders.TOPIC,topic);
        kafkaTemplate.send(new GenericMessage<>(obj,headers));
        log.info("inserted");
    }
}
