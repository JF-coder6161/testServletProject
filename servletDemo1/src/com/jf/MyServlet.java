package com.jf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = new Random().nextInt();
        String msg = num % 2 == 0 ? "happy birthday" : "happy new year";
        String decoration = "<h1 style='color:\"red\"'>" + msg + "</h1>";
        PrintWriter writer = response.getWriter();
        writer.write(decoration);
    }


}
