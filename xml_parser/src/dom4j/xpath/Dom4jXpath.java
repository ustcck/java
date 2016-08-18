package dom4j.xpath;

import dom4jUtils.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.Node;

import java.util.List;

/**
 * 使用xpath查询xml中所有的name元素的值
 * Created by ustcck on 2016/8/18.
 */
public class Dom4jXpath {
    public static void main(String[] args) {
        Document document = Dom4jUtils.getDocument("src/person.xml");
        List<Node> list = document.selectNodes("//name");
        for(Node node :list){
            System.out.println(node.getText());
        }

    }
}
