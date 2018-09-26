package com.sgic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.entity.TestEntity;
import com.sgic.repository.TestRepo;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestRepo testRepo;
	
	@Override
	public List<TestEntity> viewAll() {
		return testRepo.findAll();
	}

	@Override
	public String addOne(TestEntity testEntity) {
		testRepo.save(testEntity);
		return "Success";
	}

	@Override
	public String delete() {
		//testRepo.deleteById(id);
		return null;
	}

	@Override
	public TestEntity viewOne(Integer id) {
		return testRepo.getOne(id);
	}
	
	@Override
	public TestEntity update(Integer id) {
		return testRepo.getOne(id);
	}
	
}
