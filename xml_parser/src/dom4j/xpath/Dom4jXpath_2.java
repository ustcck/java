package dom4j.xpath;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * 使用xpath查询xml中第一个p1下面的name元素的值
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jXpath_2 {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Node name = document.selectSingleNode("//p1[@id='aaa']/name");
        System.out.println(name.getText());

        
    }
}
