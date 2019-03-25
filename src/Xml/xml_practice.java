package Xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class xml_practice {
    public static void main(String args[]) throws DocumentException{
        SAXReader reader = new SAXReader();
        Document document = reader.read("DbListViewHandler.xml");

            }

    }

