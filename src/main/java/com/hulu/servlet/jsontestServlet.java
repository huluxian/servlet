package com.hulu.servlet;

import com.alibaba.fastjson.JSON;
import com.hulu.pojo.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Description: new java files header..
 *
 * @author hulu
 * @version 1.0
 * @date 2022/7/3 20:33
 */

@WebServlet("/userJson")
public class jsontestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Object> users = new ArrayList<>();
        users.add(new user(2,"hu","666","123",1,2));
        users.add(new user(3,"lu","886","123",1,3));
        String json = JSON.toJSONString(users);//将对象转换为json字符串
        System.out.println(json);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(json);


    }
}
