package com.tbn.sg3.sms.dao.user;

import java.util.List;

import com.tbn.sg3.sms.beans.User.User;

public interface UserDao {
	
	// user-mapping.xmlの「id=select」を呼ぶ
	public User select(String id);
	
	public List<User> select_all();
	
	public void insert(User user);
	
	public void update(User user);
		
}
