package com.tbn.sg3.sms.service.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tbn.sg3.sms.beans.User.User;



public interface UserService {
    public List<User> all();
}
