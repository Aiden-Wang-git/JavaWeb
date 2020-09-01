package com.itheima.c_life;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/7/25 8:34
 */
public class LifeServlet implements Servlet {
    @Override
    /**
    * @Description
    * @Author  WangJun
    * @Date   2020/7/25 8:42
    * @Param  [servletConfig]
    * @Return void
    * @Exception
     * 初始方法
     * 执行者：服务器
     * 执行次数：一次
     * 执行时期：默认第一次访问时
    */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet初始化!");
    }


    @Override
    /**
    * @Description
    * @Author  WangJun
    * @Date   2020/7/25 8:44
    * @Param  [servletRequest, servletResponse]
    * @Return void
    * @Exception
     * 服务方法
     * 执行者：服务器
     * 执行次数：请求一次执行一次
     * 执行时期：请求来的时候
    */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务方法！");
    }

    @Override
    /**
    * @Description
    * @Author  WangJun
    * @Date   2020/7/25 9:01
    * @Param  []
    * @Return void
    * @Exception
     * 销毁方法
     * 执行者：服务器
     * 执行次数：只执行一次
     * 执行时期：当servlet被移除或者服务器被正常关闭的时候
    */
    public void destroy() {
        System.out.println("销毁方法！");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}
