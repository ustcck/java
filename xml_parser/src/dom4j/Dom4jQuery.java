package dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 使用dom4j查询xml
 * 查询xml中所有的name元素里面的值
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jQuery {
    public static void main(String[] args) throws Exception {
        selectName();
        System.out.println("--------");
        selectFir(); //得到第一个name
        System.out.println("--------");
        selectSec(); //得到第二个name
    }

    private static void selectSec() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element rootElement = document.getRootElement();
        List<Element> listp1 = rootElement.elements("p1");
        Element p2 = listp1.get(1);
        Element name2 = p2.element("name");
        System.out.println(name2.getText());

    }

    private static void selectFir() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element root = document.getRootElement();
        Element p1 = root.element("p1");
        Element name = p1.element("name");
        System.out.println(name.getText());
    }

    private static void selectName() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element rootElement = document.getRootElement();
        List<Element> listp1 = rootElement.elements("p1");
        for (Element element : listp1) {
            Element name = element.element("name");
            System.out.println(name.getText());

        }
    }
}
