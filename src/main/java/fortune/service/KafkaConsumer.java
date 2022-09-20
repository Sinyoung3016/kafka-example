package fortune.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "exam")
    public void consume(String message) {
        System.out.printf("Consumed message : %s%n", message);
    }
}