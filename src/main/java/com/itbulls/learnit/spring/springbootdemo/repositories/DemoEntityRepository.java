package com.itbulls.learnit.spring.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itbulls.learnit.spring.springbootdemo.entities.DemoEntity;

@Repository
public interface DemoEntityRepository extends JpaRepository<DemoEntity, Integer> {}
