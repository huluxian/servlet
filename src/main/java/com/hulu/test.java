package com.hulu;

import com.hulu.dao.BaseDao;

import java.sql.*;

/**
 * Description: new java files header..
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/30 19:24
 */

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      /*  //1、加载驱动(固定写法)
        Class.forName("com.mysql.jdbc.Driver");

        //2、用户信息、URL(固定写法)
        String url="jdbc:mysql://localhost:3306/library";
        String user="root";//用户名
        String pwd = "246800";//用户密码

        //3、连接成功，数据库对象(固定写法)
        Connection connection = DriverManager.getConnection(url, user, pwd);

        //4、执行sql的对象(固定写法)
        Statement statement = connection.createStatement();

        //5、执行sql语句,返回结果集
        String sql="select * from lib_user";//sql查询语句
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("username"));

        }//输出结果

        //释放连接(固定写法)
        resultSet.close();
        statement.close();
        connection.close();*/
      Connection connection= BaseDao.getConnection();
       try {
           PreparedStatement pstm = connection.prepareStatement("select * from lib_user where username=? and password=? ");
           pstm.setObject(1,"hulu");
           pstm.setObject(2,"hulu666");
           ResultSet resultSet = pstm.executeQuery();
           resultSet.next();//调整指针位置，程序会完美执行，因为此语句将指针移到下一行，也就是第一行，指针指向数据，所以调用get方法不会报错。
           System.out.println(resultSet.getObject(2));
           System.out.println(resultSet.getString("username"));
           System.out.println(resultSet.getObject(1));
           System.out.println(resultSet.getObject(3));
           System.out.println(resultSet.getObject(4));
           System.out.println(resultSet.getObject(5));

       } catch (SQLException e) {
           e.printStackTrace();
       }


    }

}
