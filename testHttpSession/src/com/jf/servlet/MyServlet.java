package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/myServlet.do"})
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * 获取HttpSession对象 是一种保存更多数据在服务端的一种技术
         * 一般保存当前登录
         * 用户权限
         * 用户的其他信息 ... ...
         *
         * getSession() 方法的执行内容
         * 1,从request中尝试获取JSESSIONID的cookie
         * 2.如果获取失败,认为上次会话已经结束,在这里要开启新的会话,创建一个新的HTTPSession并返回
         * 3.将新的HttpSession对象的JSESSIONID以Cookie的形式放入Response对象,响应给浏览器
         *
         * 如果获取成功
         * 根据JSESSIONID 在 服务器内查询对应的HttpSession对象
         *  1) 找到了,返回找到的HttpSession对象
         *  2) 没找到,创建新的HttpSession并将JSESSIONID以Cookie的形式放在Response对象,响应给浏览器
         */

        HttpSession session = req.getSession();
        // 向HttpSession中存放一些数据
        session.setAttribute("username","Jack");
        session.setAttribute("password","1234");
        session.setAttribute("level","A");


    }
}
