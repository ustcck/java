package jaxp.dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * 查询xml中第一个name元素的值
 * Created by ustcck on 2016/8/17.
 */
public class JaxpAdd {
    public static void main(String[] args) throws Exception {
        jaxp_add();  //每一个p1里面添加一个sex
    }

    private static void jaxp_add() throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document = builder.parse("src/person.xml");
        NodeList list = document.getElementsByTagName("p1");
        Node p1 = list.item(0);
        //创建标签
        Element sex = document.createElement("sex");
        //创建文本
        Text text = document.createTextNode("女");
        sex.appendChild(text);
        p1.appendChild(sex);

        //回写xml
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(new DOMSource(document),new StreamResult("src/person_1.xml"));
    }

}
