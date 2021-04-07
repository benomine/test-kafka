package org.benomine.kafkademo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerClass implements IProducer {

    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);
    private static final String TOPIC = "topic";

    private final KafkaTemplate template;

    public ProducerClass(KafkaTemplate template) {
        this.template = template;
    }

    public void sendMessage(String message) {
        logger.info(String.format("** Producer sending message : %s", message));
        template.send(TOPIC, message);
    }
}
