package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login servlet invoked");
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String msg = null;

        if ("jj".equals(username)&& "123".equals(pwd)){
            msg = "Success";
        }else {
            msg = "login fail";
        }
        resp.getWriter().write("<h1>"+msg+"<h1/>");
    }
}
