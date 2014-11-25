package com.tbn.sms.dao.user;

import java.util.List;

import com.tbn.sms.beans.User.User;

public interface UserMapper {
	
	// user-mapping.xmlの「id=select」を呼ぶ
	public List<User> select(String id);
	
	public List<User> select_all();
		
}
