package com.itheima.web.servlet;

import com.itheima.UserServices.UserSerice;
import com.itheima.domain.User;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    @Override
    public void init(){
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("count",0);
        System.out.println("初始化次数成功!");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = null;
        try {
            user = new UserSerice().login(username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("网络异常，请稍后尝试！");
        }
        if (user==null){
            resp.getWriter().println("用户或者密码错误！三秒之后跳转登录页面");
            resp.setHeader("refresh","3;url=login.htm");
        }
        else {
            resp.getWriter().println(user.getUsername()+":登录成功！");
            ServletContext servletContext = this.getServletContext();
            Integer cishu = (Integer) servletContext.getAttribute("count");
            servletContext.setAttribute("count",++cishu);
        }
    }
}
