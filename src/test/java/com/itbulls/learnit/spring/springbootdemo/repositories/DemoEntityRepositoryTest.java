package com.itbulls.learnit.spring.springbootdemo.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itbulls.learnit.spring.springbootdemo.SpringbootdemoApplication;
import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;

@SpringBootTest(classes = SpringbootdemoApplication.class)
public class DemoEntityRepositoryTest {

	@Autowired
	private DemoEntityRepository entityRepository;

	@Test
	public void shouldSaveEntity() {
		DemoEntity entity = entityRepository.save(new DemoEntity(3, "The third"));
		DemoEntity foundedEntity = entityRepository.findById(entity.getId()).get();

		assertNotNull(foundedEntity);
		assertEquals(entity.getLabel(), foundedEntity.getLabel());
	}
}
