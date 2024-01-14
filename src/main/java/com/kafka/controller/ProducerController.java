package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Student;
import com.kafka.service.ProducerService;

@RestController
@RequestMapping("/producer")
public class ProducerController {

	@Autowired
	ProducerService producerService;
	
	@GetMapping("/produceMessage")
	public void ProduceMessage() {
		
		for(int i=1;i<=5;i++) {
			
			Student student = new Student(i,"Student "+i,"Father "+i,"Mother "+i,18);
			producerService.sendStudentData(student);
		}
	}
}
