package com.jf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/myServlet1.do"})
public class MyServlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 service invoked");

        String money = req.getParameter("money");

        System.out.println("money" + money);

        // 请求转发 另一个组件
        // 获取请求转发器
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("myServlet2.do");
        // 请求转发器 发起动作
        requestDispatcher.forward(req,resp);

        //
    }
}
