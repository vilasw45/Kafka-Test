package com.kafkatest.kafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerDemo {


    @KafkaListener(topics = "jsondata", groupId = "group1")
    public void comsumers(String data) {
        System.out.println(data);
    }

}
