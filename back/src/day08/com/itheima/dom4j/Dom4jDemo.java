package day08.com.itheima.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.util.List;

public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        //创建核心对象
        SAXReader saxReader = new SAXReader();
        //获取dom数
        Document read = saxReader.read("./src/xml/web.xml");
        //获取根节点
        Element rootElement = read.getRootElement();
        //获取其他节点
        List<Element> elements = rootElement.elements();
        System.out.println(rootElement.attributeValue("version"));
        for (Element element:elements) {
            String text = element.elementText("servlet-name");
            System.out.println(text);
        }
    }
}
