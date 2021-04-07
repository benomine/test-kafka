package org.benomine.kafkademo.services;

import org.springframework.stereotype.Component;

@Component
public interface IProducer {
    void sendMessage(String message);
}
