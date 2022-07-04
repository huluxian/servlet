package com.hulu.dao;

import com.hulu.pojo.user;

import java.sql.Connection;
import java.sql.SQLException;

/*
* 接口是规范,实现类是功能实现
*
* */
public interface UserDao {

    public user getLoginUser(Connection connection,String userName,String password) throws SQLException;

}
