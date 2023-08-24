package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(urlPatterns = {"/myServlet.do"})
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("username","JackFe");
        Cookie cookie1 = new Cookie("gender", URLEncoder.encode("男","Utf-8"));
        cookie1.setMaxAge(60);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }
}
