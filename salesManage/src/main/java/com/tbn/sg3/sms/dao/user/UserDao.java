package com.tbn.sg3.sms.dao.user;

import java.util.List;

import com.tbn.sg3.sms.beans.User.User;

public interface UserDao {
	
	// user-mapping.xmlの「id=select」を呼ぶ
	public List<User> select(int id);
	
	public List<User> select_all();
		
}