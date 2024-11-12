package viniciusmassari.kafka_spring.events.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "topico1", groupId = "1")
    public void listenTopico1(ConsumerRecord<String, String> consumerRecordConsumerRecord) {
        System.out.println("Message received at topic " + consumerRecordConsumerRecord.topic());
        System.out.println("The key is " + consumerRecordConsumerRecord.key());
        System.out.println("The message is " + consumerRecordConsumerRecord.value());
    }

    @KafkaListener(topics = "topico2", groupId = "1")
    public void listenTopico2(ProducerRecord<String, String> consumerRecordConsumerRecord) {
        System.out.println("Message received at topic " + consumerRecordConsumerRecord.topic());
        System.out.println("The key is " + consumerRecordConsumerRecord.key());
        System.out.println("The message is " + consumerRecordConsumerRecord.value());
    }

}