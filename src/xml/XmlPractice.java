package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class XmlPractice {
    public static void main(String args[]) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read("DbListViewHandler.xml");

        List lst = document.getRootElement().elements();
        int i;
        Element e;
        for (i = 0; i < lst.size(); i++) {
            e = (Element) lst.get(i);
            System.out.println(e.addAttribute("ID", "0b00000181e8ddfb"));
        }

        // System.out.println(document.getName());

        Element root = document.getRootElement();
        for (Iterator it = root.elementIterator(); it.hasNext(); ) {
            Element element = (Element) it.next();
            System.out.println(element.addAttribute("id", "name").getText());
        }
    }

    public void createDocument() throws IOException {
        Document document = DocumentHelper.createDocument();
        Element root, be;

        /**
         * 套用變數的寫法
         */
        root = document.addElement("a");
        be = root.addElement("b");
        be.addText("1");

        /**
         * 直接以元素塞入值
         */
        root.addElement("c").addText("3");
        /**
         * 加入屬性&屬性值
         */
        root.addElement("d").addText("4").addAttribute("id", "001");

        FileWriter out = null;
        try {
            out = new FileWriter("d:\\foo.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        document.write(out);
        out.close();

        String text=document.asXML();
        System.out.println(text);

    }

}
