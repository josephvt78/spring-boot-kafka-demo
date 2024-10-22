package net.josephvt.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;
import net.josephvt.springboot.payload.User;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "springkafka_json", groupId = "myGroup")
    public void consume(User user) {

        LOGGER.info(String.format("JSON Message receieved ->  %s", user.toString()));
    }

}