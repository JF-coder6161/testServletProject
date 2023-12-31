package com.jf.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns={"/myServlet5.do","/a.do","/c.do"},loadOnStartup = 6,initParams = {@WebInitParam(name="JackMa",value = "good")})
public class MyServlet5 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service process");
        ServletConfig servletConfig = this.getServletConfig();
        System.out.println("JackMa=" +   servletConfig.getInitParameter("JackMa"));
    }
}
