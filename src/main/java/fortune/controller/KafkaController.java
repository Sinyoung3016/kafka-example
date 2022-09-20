package fortune.controller;

import fortune.service.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/kafka")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);
        return "success";
    }
}