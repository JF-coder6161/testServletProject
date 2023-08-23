package com.jf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/myServlet4.do"})
public class MyServlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet4 service invoked");

        String money = req.getParameter("money");

        System.out.println("money" + money);

        resp.getWriter().println("servlet4在转发之后增加的内容 --> " + money + " 元");

    }
}
