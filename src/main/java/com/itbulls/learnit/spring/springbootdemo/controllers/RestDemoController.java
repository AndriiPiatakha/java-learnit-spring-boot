package com.itbulls.learnit.spring.springbootdemo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;


@RestController
public class RestDemoController {
	
	private List<DemoEntity> entities = new ArrayList<>(Arrays.asList(
				new DemoEntity(1, "The first"),
				new DemoEntity(2, "The second")
			));
	
	@GetMapping("/v1/entities")
	public List<DemoEntity> getAll() {
		return this.entities;
	}
	
	@PostMapping("/v1/entities")
	public boolean addEntity(@RequestBody DemoEntity entity) {
		entities.add(entity);
		return true;
	}
	
	@GetMapping("/v1/entities/{id}")
	public DemoEntity getById(@PathVariable Integer id) {
		return entities.stream().filter(entity -> entity.getId().equals(id)).findFirst().get();
	}
	

}
