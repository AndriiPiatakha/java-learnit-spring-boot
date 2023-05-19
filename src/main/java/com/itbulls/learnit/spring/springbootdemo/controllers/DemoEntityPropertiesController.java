package com.itbulls.learnit.spring.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;

@RestController
public class DemoEntityPropertiesController {

	@Autowired
	private DemoEntity demoEntity;
	
	@GetMapping("/demo-entity-test")
	public String getDemoProperties() {
		return String.format("Demo entity was initialized with ID = %d, and label = %s", 
				demoEntity.getId(), demoEntity.getLabel());
	}
	
}
