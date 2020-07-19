package day08.com.itheima.example1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.lang.model.util.Elements;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *  @author: WangJun
 *  @Date: 2020/7/16 16:02
 *  @Description:
 */
public class Demo {
    @Test
    public void f1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, SAXException, DocumentException {
        Document document = new SAXReader().read("C:\\Users\\Wj\\Desktop\\JavaWeb\\back\\src\\xml\\web.xml");
        Element servletpattern = (Element)document.selectSingleNode("//url-pattern");
        Element servletclass = (Element)document.selectSingleNode("//servlet-class");
        System.out.println(servletpattern);
        String pattern = servletpattern.getText();
        String classtext = servletclass.getText();
        Map<String,String> map = new HashMap<>();
        map.put(pattern,classtext);
        String value = map.get("/hello");
        Class clazz = Class.forName(value);
        Object object = clazz.newInstance();
        Method method = clazz.getMethod("add", int.class);
        method.invoke(object, 1);
    }
}
