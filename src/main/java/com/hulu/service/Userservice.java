package com.hulu.service;

import com.hulu.pojo.user;

import java.sql.SQLException;

public interface Userservice {

    public user login(String username,String password) throws SQLException;

}
