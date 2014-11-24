package com.tbn.sms.dao.homeImpl;

import org.springframework.stereotype.Component;

import com.tbn.sms.dao.home.ExampleDao;

@Component
public class ExampleDaoImpl implements ExampleDao {

	@Override
	public String find() {
		return "Test dao!!";
	}
	
	
		
}
