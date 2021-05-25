package com.example.demo;

import com.example.demo.mem_db.InMemDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "important-message";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message){
        kafkaTemplate.send(topic, message);

        return "Published !!!" + Helpers.returnHome();
    }

    @GetMapping("/messages")
    public String get() {
        InMemDB memdb = InMemDB.getInstance();

        return memdb.getMessages().toString()
                + Helpers.returnHome();
    }
}
