package com.itheima.b_request.d_row;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RowServlet", urlPatterns = "/row")
public class RowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        System.out.println("method:"+method);
        String uri = request.getRequestURI();
        System.out.println("uri:"+uri);
        StringBuffer url = request.getRequestURL();
        System.out.println("url"+url);
        String queryString = request.getQueryString();
        System.out.println("请求参数："+queryString);
        String addr = request.getRemoteAddr();
        System.out.println("ip:"+addr);
        String contextPath = request.getContextPath();
        System.out.println("项目名:"+contextPath);
        String protocol = request.getProtocol();
        System.out.println("协议/版本："+protocol);
    }
}
