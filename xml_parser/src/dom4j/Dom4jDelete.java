package dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;

/**
 * 使用dom4j删除school元素
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jDelete {
    public static void main(String[] args) throws Exception {
        deleteSchool();

    }

    private static void deleteSchool() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person_3.xml");
        Element rootElement = document.getRootElement();
        Element p1 = rootElement.element("p1");

        Element school = p1.element("school");
        p1.remove(school);

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/person_5.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
    }



}
