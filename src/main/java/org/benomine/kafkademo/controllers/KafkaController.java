package org.benomine.kafkademo.controllers;

import org.apache.kafka.clients.admin.NewTopic;
import org.benomine.kafkademo.services.IProducer;
import org.benomine.kafkademo.services.ProducerClass;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {
    private final IProducer _producer;

    public KafkaController(ProducerClass producer) {
        _producer = producer;
    }

    @PostMapping(value = "/publish")
    public String sendMessage(@RequestParam("message") String message) {
        _producer.sendMessage(message);
        return message;
    }

    @Bean
    public NewTopic adviceTopic() {
        return new NewTopic("topic", 3, (short) 1);
    }
}
