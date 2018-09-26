package com.sgic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.entity.TestEntity;

public interface TestRepo extends JpaRepository<TestEntity, Integer /*primary key data type*/>{
	
}
