package com.itbulls.learnit.spring.springbootdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
	
	@Id
	private Integer id;
	private String label;
	
	public DemoEntity() {
	}
	
	public DemoEntity(Integer id, String label) {
		this.id = id;
		this.label = label;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
