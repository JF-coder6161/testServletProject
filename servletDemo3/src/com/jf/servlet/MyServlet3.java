package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet3 extends HttpServlet {

    int i = 10;

    public MyServlet3() {
        System.out.println("MyServlet4 Constructor invoked");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet4 init invoked");
    }

    @Override
    protected synchronized void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(i++);
        System.out.println("MyServlet4 service invoked");
    }

    @Override
    public void destroy() {
        System.out.println("MyServlet4 destroy invoked");
    }
}
