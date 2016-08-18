package dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/**
 * 使用dom4j获取属性值
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jAttribute {
    public static void main(String[] args) throws Exception {
        getAttribute();

    }

    private static void getAttribute() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element rootElement = document.getRootElement();
        Element p1 = rootElement.element("p1");
        String attr = p1.attributeValue("id");
        System.out.println(attr);
    }


}
