package com.itheima.b_request.f_param;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "ParamServlet", urlPatterns = "/param")
public class ParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("username:"+username);
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("hobbies:"+ Arrays.toString(hobbies));
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String s:parameterMap.keySet()){
            System.out.println(s+":"+Arrays.toString(parameterMap.get(s)));
        }
    }
}
