package com.tbn.sms.service.homeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tbn.sms.dao.homeImpl.ExampleDaoImpl;
import com.tbn.sms.service.home.ExampleService;

@Component
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDaoImpl dao;
	
	@Override
	public String find() {
		return dao.find();
	}
	
}
