package com.example.service_one.service_one.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final String TOPIC_NAME="geeks-foor-geeks";
    private final KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String,String>kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }
    public void sendMessage(String msg){
        this.kafkaTemplate.send(TOPIC_NAME,msg);
    }

}
