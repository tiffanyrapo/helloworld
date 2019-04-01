package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileWriter;
import java.io.IOException;



class createDocument {
    public static void main(String args[]) throws DocumentException, IOException {

        Document document = DocumentHelper.createDocument();
        Element root;

        //根目錄root
        root = document.addElement("students");
        /**
         * Element:元素
         * Attribute:屬性
         * Text:值
         */
        root.addElement("stu").addAttribute("id","001").addElement("name").addText("peter");
        root.addElement("stu").addAttribute("id","002").addElement("name").addText("john");
        root.addElement("stu").addAttribute("id","003").addElement("name").addText("tom");

        /**
         * 寫入檔案
         */
        FileWriter out = new FileWriter("createDocument.xml");
        document.write(out);
        out.close();
        /**
         * 讀檔
         */
        SAXReader reader = new SAXReader();
        document = reader.read("d:\\createDocument.xml");

        /**
        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
            Element element = it.next();

            System.out.print(element.attribute("sn").getText());

        }**/
    }
}

