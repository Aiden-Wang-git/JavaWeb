package com.itheima.a_response.a_location;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 *  @author: WangJun
 *  @Date: 2020/7/28 14:36
 *  @Description:重定向
 */
public class Loc1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("没零钱！重定向去loc2...");
        response.setStatus(302);
        response.setHeader("location","/day_10_war_exploded/loc2");
    }
}
