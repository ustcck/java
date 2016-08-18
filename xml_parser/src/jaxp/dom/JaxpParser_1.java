package jaxp.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 查询xml中第一个name元素的值
 * Created by ustcck on 2016/8/17.
 */
public class JaxpParser_1 {
    public static void main(String[] args) throws Exception {
        selectAll();  //获取所有name元素
        selcetSin();  //查询第一个name元素
    }

    private static void selcetSin() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document =  builder.parse("src/person.xml");
        NodeList list=document.getElementsByTagName("name");
        Node name_1 = list.item(0);
        String s = name_1.getTextContent();
        System.out.println(s);

    }

    private static void selectAll() throws Exception {
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
