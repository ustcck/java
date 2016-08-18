package dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;

/**
 * 使用dom4j修改age元素
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jChange {
    public static void main(String[] args) throws Exception {
        addSex();

    }

    private static void addSex() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element rootElement = document.getRootElement();
        Element p1 = rootElement.element("p1");
        Element age = p1.element("age");
        age.setText("25");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/person_4.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
    }


}
