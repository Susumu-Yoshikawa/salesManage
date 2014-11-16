package com.tbn.sales.db.dao.impl;

import org.springframework.stereotype.Component;

import com.tbn.sales.db.dao.ExampleDao;

@Component
public class ExampleDaoImpl implements ExampleDao {

	@Override
	public String find() {
		return "Test dao!!";
	}
	
	
		
}
