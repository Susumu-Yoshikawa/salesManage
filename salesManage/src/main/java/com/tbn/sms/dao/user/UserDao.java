package com.tbn.sms.dao.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.tbn.sms.beans.User.User;
import com.tbn.sms.dao.util.DaoUtil;

public class UserDao {
	private SqlSessionFactory sessionFactory;

    public UserDao() {
        sessionFactory = DaoUtil.getSqlSessionFactory();
    }

    public List<User> all() {
        SqlSession session = sessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.select_all();
        session.close();

        return list;
    }
}
