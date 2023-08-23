package com.jf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/myServlet3.do"})
public class MyServlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet3 service invoked");

        String money = req.getParameter("money");

        System.out.println("money" + money);

        // 设置响应类型和编码(include模式下)
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("servlet3在转发之前增加的内容 --> 给钱");

        // 请求转发 另一个组件
        // 获取请求转发器
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("myServlet4.do");
        // 请求转发器 发起动作
        requestDispatcher.include(req,resp);

        // 继续增加响应信息(include模式)
        resp.getWriter().println("servlet4转发回来之后添加的响应信息 ！！！");
    }
}
