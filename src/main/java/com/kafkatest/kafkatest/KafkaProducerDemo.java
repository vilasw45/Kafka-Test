package com.kafkatest.kafkatest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class KafkaProducerDemo {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void featchApi(){
        List<PostDto> list = restTemplate
                .getForObject("https://jsonplaceholder.typicode.com/posts", List.class);

       List<PostDto> validPost = list
               .stream()
               .filter(post -> post.getTitle() !=null)
               .toList();

        kafkaTemplate.send("jsondata", validPost.toString());

    }

}
