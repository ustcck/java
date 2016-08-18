package jaxp.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 实现jaxp解析xml文件
 * Created by ustcck on 2016/8/17.
 */
public class JaxpParser {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document =  builder.parse("src/person.xml");
        NodeList list=document.getElementsByTagName("name");
        for (int i = 0; i < list.getLength(); i++) {
            Node name = list.item(i);     //得到每一个name元素
            String s = name.getTextContent();
            System.out.println(s);
        }
    }
}
