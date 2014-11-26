package com.tbn.sg3.sms.service.userImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.tbn.sg3.sms.beans.User.User;
import com.tbn.sg3.sms.dao.user.UserDao;
import com.tbn.sg3.sms.dao.util.DaoUtil;
import com.tbn.sg3.sms.service.user.UserService;

@Component
public class UserServiceImpl implements UserService {
	private SqlSessionFactory sessionFactory;

    public UserServiceImpl() {
        sessionFactory = DaoUtil.getSqlSessionFactory();
    }

    @Override
    public List<User> all() {
        SqlSession session = sessionFactory.openSession();
        UserDao dao = session.getMapper(UserDao.class);
        List<User> list = dao.select(1);
        System.out.println(list);
        session.close();

        return list;
    }
}