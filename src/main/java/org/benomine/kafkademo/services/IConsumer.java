package org.benomine.kafkademo.services;

import org.springframework.stereotype.Component;

@Component
public interface IConsumer {
    void consume(String message);
}
