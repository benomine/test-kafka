package org.benomine.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerClass implements IConsumer {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerClass.class);

    @KafkaListener(topics = "topic")
    public void consume(String message) {
        logger.info(String.format("** Consumer receives message : %s", message));
    }
}
