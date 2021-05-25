package com.example.demo.listener;

import com.example.demo.mem_db.InMemDB;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    //@KafkaListener(topics = "important-message", groupId = "group_id")
    @KafkaListener(topics = "${cloudkarafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        InMemDB memdb = InMemDB.getInstance();
        memdb.appendMessage(message);
        //System.out.println("Consumed: " + message);
    }
}
