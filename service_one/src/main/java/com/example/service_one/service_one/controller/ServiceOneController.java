package com.example.service_one.service_one.controller;

import com.example.service_one.service_one.Dao.ResponseDao;
import com.example.service_one.service_one.services.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    private final KafkaProducer kafkaProducer;

    public ServiceOneController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    @GetMapping("/first_name")
    public ResponseEntity<ResponseDao> getFirstName(){
        return ResponseEntity.ok(new ResponseDao("Sankalp"));
    }
    @PostMapping("/kafka/send")
    public String sendMessage(@RequestParam String message){
        this.kafkaProducer.sendMessage(message);
        return "Message sent"+" "+message;
    }
}
