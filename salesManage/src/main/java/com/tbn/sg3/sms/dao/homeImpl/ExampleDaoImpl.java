package com.tbn.sg3.sms.dao.homeImpl;

import org.springframework.stereotype.Component;

import com.tbn.sg3.sms.dao.home.ExampleDao;

@Component
public class ExampleDaoImpl implements ExampleDao {

	@Override
	public String find() {
		return "Test dao!!";
	}
	
	
		
}
