package jaxp.sax;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * jaxp解析器中的sax解析
 * Created by ustcck on 2016/8/17.
 */
public class SAX_Parser {
    public static void main(String[] args) throws Exception {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        saxParser.parse("src/person.xml", new MyDefaultHander_2());

    }
}

class MyDefaultHander_2 extends DefaultHandler {
    boolean flag = false;

    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if ("name".equals(qName)) {
            flag = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
        if (flag == true) {
            System.out.println(new String(ch, start, length));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws org.xml.sax.SAXException {
        if ("name".equals(qName)){
            flag = false;
        }
    }
}


class MyDefaultHander extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        //super.startElement(uri, localName, qName, attributes);
        System.out.println("start:" + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
        //uper.characters(ch, start, length);
        System.out.println("text:" + new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws org.xml.sax.SAXException {
        //super.endElement(uri, localName, qName);
        System.out.println("end:" + qName);
    }
}