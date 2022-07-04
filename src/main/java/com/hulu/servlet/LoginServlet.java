package com.hulu.servlet;

import com.hulu.pojo.user;
import com.hulu.service.UserServiceImpl;
import com.hulu.service.Userservice;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Description: Servlet相当于controller层，
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/30 17:16
 */
@WebServlet("/login")//servlet注解
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用loginSerlvet");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("request的 用户名是"+username);

        Userservice userservice=new UserServiceImpl();
        user loginuser = null;
        try {
            loginuser = userservice.login(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 判断用户是否存在，存在的话存在加入session中
        if (loginuser!=null){
            req.getSession().setAttribute("user",loginuser);
            resp.sendRedirect("frame.jsp");

        }
        else {

            System.out.println("没有查询到用户哦！");
            req.setAttribute("error","用户或者密码不正确");
            req.getRequestDispatcher("login.jsp").forward(req,resp);

        }

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
