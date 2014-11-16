package com.tbn.sales.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tbn.sales.db.dao.ExampleDao;
import com.tbn.sales.db.service.ExampleService;

@Component
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDao dao;
	
	@Override
	public String find() {
		return dao.find();
	}
	
}
