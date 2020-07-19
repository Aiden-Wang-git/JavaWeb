package day08.com.itheima.reflect;

import itheima.domain.HelloMyServlet;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    @Test
    public void f1(){
        HelloMyServlet a = new HelloMyServlet();
        a.add();
        a.add(1,2);
        a.add(11);
    }

    @Test
    public void f2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class claazz = Class.forName("itheima.domain.HelloMyServlet");
        //通过字节码对象创建一个空参的对象
        HelloMyServlet o = (HelloMyServlet)claazz.newInstance();
        o.add();
        o.add(1,2);
        o.add(11);
    }

    @Test
    public void f3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("itheima.domain.HelloMyServlet");
        HelloMyServlet object = (HelloMyServlet) clazz.newInstance();
        Method add1 = clazz.getMethod("add");
        add1.invoke(object);
        Method add2 = clazz.getMethod("add", int.class);
        add2.invoke(object,10);
        Method add3 = clazz.getMethod("add", int.class, int.class);
        add3.invoke(object,1,1);
    }
}
