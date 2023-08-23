package com.jf.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyServlet42 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        try {
            List list = (List)servletContext.getAttribute("list");
            System.out.println(list);
        }catch (Exception e){

        }
        ServletConfig servletConfig = this.getServletConfig();
        String myservlet42 = servletConfig.getInitParameter("servlet42");
        System.out.println(myservlet42);
    }
}
