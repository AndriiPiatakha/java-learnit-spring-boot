package com.itbulls.learnit.spring.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;

@Configuration
public class BeansConfiguration {
	
	@Bean
	@ConfigurationProperties(prefix = "entity")
	public DemoEntity demoEntity() {
		return new DemoEntity();
	}

}
