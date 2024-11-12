package viniciusmassari.kafka_spring.events.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import viniciusmassari.kafka_spring.events.producer.MessageProducer;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message, @RequestParam("topico") String topic) {
        messageProducer.sendMessage(topic, message);
        return "Message sent: " + message;
    }

}