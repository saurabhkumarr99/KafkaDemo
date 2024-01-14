package com.kafka.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka.model.Student;

@Configuration
public class KafkaConsumerConfig {

	@KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME, groupId = "group-1")
	public void consume(ConsumerRecord<String, Student> record) {
		System.out.println("Received Message:"+record.toString());
		System.out.println("Key: " + record.key());
		System.out.println("Value: " + record.value());
		System.out.println("Partition: " + record.partition());
		System.out.println("Offset: " + record.offset());
	}
}
