package com.itbulls.learnit.spring.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;
import com.itbulls.learnit.spring.springbootdemo.repositories.DemoEntityRepository;

@RestController
public class JpaDemoController {
	
	@Autowired
	private DemoEntityRepository entityRepository;
	
	@PostMapping("/v2/entities")
	public String saveEntity(@RequestBody DemoEntity entity) {
		entityRepository.save(entity);
		return "Entity is saved";
	}

}
