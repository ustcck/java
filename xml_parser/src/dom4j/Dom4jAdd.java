package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 * 使用dom4j添加sex元素
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jAdd {
    public static void main(String[] args) throws Exception {
        addSex();

    }

    private static void addSex() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/person.xml");
        Element rootElement = document.getRootElement();
        Element p1 = rootElement.element("p1");
        Element sex = p1.addElement("sex");
        sex.setText("女");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/person_2.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
    }


}
