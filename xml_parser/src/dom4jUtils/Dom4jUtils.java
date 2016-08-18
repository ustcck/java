package dom4jUtils;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * dom4j的Utils工具包
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jUtils {
    public static Document getDocument(String path) {
        try {
            SAXReader reader = new SAXReader();
            Document document= reader.read(path);
            return document;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
