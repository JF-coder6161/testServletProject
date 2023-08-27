package com.jf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/myServlet1.do"})
public class MyServlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        if (null != cookies){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if("servlet3".equals(name)){
                    System.out.println("not first request cookie value + 1");
                    Cookie servlet3 = new Cookie("servlet3", String.valueOf(Integer.parseInt(cookie.getValue()) + 1));
                    resp.addCookie(servlet3);
                    flag = true;
                }
            }

            if(!flag){
                System.out.println("first request");
                Cookie servlet3 = new Cookie("servlet3", "1");
                resp.addCookie(servlet3);
            }

        }
    }
}
