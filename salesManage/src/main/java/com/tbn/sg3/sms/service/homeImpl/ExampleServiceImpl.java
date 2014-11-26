package com.tbn.sg3.sms.service.homeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tbn.sg3.sms.dao.homeImpl.ExampleDaoImpl;
import com.tbn.sg3.sms.service.home.ExampleService;

@Component
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDaoImpl dao;
	
	@Override
	public String find() {
		return dao.find();
	}
	
}
