package com.jf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/c/c2/myServlet10.do"})
public class MyServlet10 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 请求转发的路径写法
         * 1. 相对基准路径：相对于当前Servlet本身的位置，urlPattern决定了位置
         * 2. 绝对基准路径：永远是以项目为基准路径(不允许跨服务)
         */

        // 相对路径访问 a1.html
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("../../a/a2/a1.html");
//        requestDispatcher.forward(req,resp);

        // 绝对路径访问 a1.html
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/a/a2/a1.html");
        requestDispatcher.forward(req,resp);


    }
}
