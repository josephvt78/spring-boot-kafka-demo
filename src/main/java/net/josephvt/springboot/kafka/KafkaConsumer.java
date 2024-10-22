package net.josephvt.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "springkafka", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message receieved ->  %s", message));
    }

}