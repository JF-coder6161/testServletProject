package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/testServlet5.do"})
public class Servlet05 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到");
        String uname = req.getParameter("uname");
        String info = "";
        if (null != uname && "msb".equals(uname)){
            info = "用户名已占用";
        }else {
            info = "用户名可用";
        }
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("<h1>hello</h1>");
    }
}
