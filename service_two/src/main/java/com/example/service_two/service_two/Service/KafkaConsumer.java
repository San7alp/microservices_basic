package com.example.service_two.service_two.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "geeks-foor-geeks",groupId = "service-two-group")
    public void consume(String message){
        System.out.printf("Received message in Service"+" "+message);
    }
}
