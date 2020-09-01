package com.itheima.b_request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("username");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("数据:"+value);
        System.out.println(value);
    }
}
