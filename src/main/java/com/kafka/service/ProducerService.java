package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.config.AppConstant;
import com.kafka.model.Student;

@Service
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, Student> kafkaTemplate;

	public void sendStudentData(Student student) {
		kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, student);
		System.out.println("Message sent: " + student);
	}
	
}
