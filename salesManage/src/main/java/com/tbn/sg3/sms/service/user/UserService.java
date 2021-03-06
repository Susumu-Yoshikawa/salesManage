package com.tbn.sg3.sms.service.user;

import java.util.List;

import com.tbn.sg3.sms.beans.User.User;



public interface UserService {
    public List<User> all();
    public User select(int id);
    public void insert(User user);
    public void update(User user);
    public void delete(User user);
}
