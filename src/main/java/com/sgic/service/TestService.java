package com.sgic.service;

import java.util.List;

import com.sgic.entity.TestEntity;

public interface TestService {
	List<TestEntity> viewAll();
	String addOne(TestEntity testEntity);
	String delete();
	TestEntity viewOne(Integer id);
	TestEntity update(Integer id);

}
