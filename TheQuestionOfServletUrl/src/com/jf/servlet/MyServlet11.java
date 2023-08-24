package com.jf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/c/c2/myServlet11.do"})
public class MyServlet11 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 响应重定向
        // 相对路径 : 受urlPattern 影响
        resp.sendRedirect("../../a/a2/a1.html");

        //响应重定向的绝对路径中要加项目部署名，除非当前项目没有给定部署名

    }
}
