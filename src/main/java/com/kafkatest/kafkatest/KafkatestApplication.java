package com.kafkatest.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkatestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}

	@Autowired
	KafkaProducerDemo kafkaProducer;

	@Override
	public void run(String... args) throws Exception {
		kafkaProducer.featchApi();
	}


}
