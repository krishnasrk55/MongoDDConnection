package com.example.mongodb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class Employee {
	@Autowired
	private MongoTemplate template;
	
	
	public List<Object> getAllEmployee(){
		
		

		
		return template.findAll(Object.class, "employee");
	}
	

}
