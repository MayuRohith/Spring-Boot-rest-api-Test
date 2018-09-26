package com.sgic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.entity.TestEntity;
import com.sgic.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService testService;
	List<TestEntity> Test =new ArrayList<>();
	
	
	@GetMapping("/Test")
	public List<TestEntity> GetTest() {
		return testService.viewAll();
	}
	
	@GetMapping(value="/Test/{Id}")
	public TestEntity viewOne(@PathVariable("Id") Integer id ) {
		return testService.viewOne(id);
	}
	
	@PostMapping("/Test")
	public String PostTest(@RequestBody TestEntity Ptest) {
		String message = testService.addOne(Ptest);
		return message;
	}
	
	@DeleteMapping("/Test")
	public String DeleteTest(TestEntity Dtest) {
		Test.remove(Dtest);
		return "Deleted successfully";
	}
	
	@PutMapping(value="/Test/{Id}")
	public String UpdateTest(@PathVariable("Id") Integer id) {
		Test.set(id, (TestEntity) Test);
		return "Successfully Updated";
	}
	
}
