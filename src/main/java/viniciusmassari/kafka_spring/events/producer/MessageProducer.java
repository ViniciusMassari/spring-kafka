package viniciusmassari.kafka_spring.events.producer;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        String chave = UUID.randomUUID().toString();
        String messageToSend = LocalDate.now() + " " + message;
        kafkaTemplate.send(topic, chave, messageToSend);
    }

}