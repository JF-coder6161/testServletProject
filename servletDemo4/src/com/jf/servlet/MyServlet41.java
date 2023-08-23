package com.jf.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyServlet41 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext1 = req.getServletContext();
        ServletContext servletContext2 = this.getServletContext();
        boolean b = servletContext1 == servletContext2;
        System.out.println(b);
        // 获取当前项目的部署名
        String contextPath = servletContext1.getContextPath();
        System.out.println("contextPath"+contextPath);
        // 将一个相对路径转化为项目的绝对路径
        String fileUpload = servletContext1.getRealPath("fileUpload");
        System.out.println(fileUpload);
        String serverInfo = servletContext1.getServerInfo();
        System.out.println("servletInfo"+serverInfo);
        int majorVersion = servletContext1.getMajorVersion();
        int minorVersion = servletContext1.getMinorVersion();
        System.out.println(majorVersion+":"+minorVersion);
        // 获取web.xml中配置的全局的初始信息
        String username = servletContext1.getInitParameter("username");
        String password = servletContext1.getInitParameter("password");
        System.out.println(username+":"+password);
        //向ServletContext对象中增加数据 域对象
        List<String> data=new ArrayList<>();
        Collections.addAll(data,"张三","李四","王五");
        servletContext1.setAttribute("list",data);
        servletContext1.setAttribute("gender","boy");
    }
}
