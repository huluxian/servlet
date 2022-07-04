package com.hulu.dao;

import com.hulu.pojo.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description: 一个用户查询类，但是貌似现在不需要了。。
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/29 22:06
 */

public class UserDaoImpl implements UserDao {

    @Override
    public user getLoginUser(Connection connection, String userName, String password) throws SQLException {


        // 1.新建三个对象
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        user user = new user();
        // 首先判断数据库是否连接,然后构造预编译查询语句,判断用户是否存在
        if (connection != null) {
            String sql = "select * from lib_user where username=? and password=?";
            ResultSet userLogin = BaseDao.getUserLogin(connection, sql, userName, password, rs, preparedStatement);
            //System.out.println("dao查询得到的用户："+userLogin);
            if (userLogin.next()&&userLogin.getString(1)!=null){
                System.out.println(userLogin.getObject("username"));

                user.setId((Integer) userLogin.getObject("id"));
                user.setUsername((String) userLogin.getObject("username"));
                user.setPassword(userLogin.getString("password"));
                user.setNumber(userLogin.getString("number"));
                user.setAdmin(userLogin.getInt("admin"));
                user.setSid(userLogin.getInt("sid"));
                // 关闭资源
                BaseDao.closeResource(null, preparedStatement, rs);
                return user;
            }


        }
        // 关闭资源
        BaseDao.closeResource(null, preparedStatement, rs);
        return null;
    }


}
