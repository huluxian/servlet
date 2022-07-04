package com.hulu.service;

import com.hulu.dao.BaseDao;
import com.hulu.dao.UserDao;
import com.hulu.dao.UserDaoImpl;
import com.hulu.pojo.user;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Description: new java files header..
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/30 16:56
 */

public class UserServiceImpl implements Userservice {

    private UserDao userDao=new UserDaoImpl();

    @Override
    public user login(String username, String password) throws SQLException {
        Connection connection=BaseDao.getConnection();
        user loginUser = userDao.getLoginUser(connection, username, password);
        System.out.println("Service="+loginUser);
        return loginUser;
    }
}
