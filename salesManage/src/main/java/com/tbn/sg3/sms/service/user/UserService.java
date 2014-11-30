package com.tbn.sg3.sms.service.user;

import java.util.List;

import com.tbn.sg3.sms.beans.User.User;



public interface UserService {
    public List<User> all();
    public List<User> select(int id);
}
