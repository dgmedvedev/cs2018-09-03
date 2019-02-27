package class_work.lesson11;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.URL;

public class Task11 {
    public static void start() {
        try {
            URL url = new URL("https://goo.gl/tFpBDV");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 FileWriter write = new FileWriter("text.txt")) {
                String s;
                while ((s = reader.readLine()) != null) {
                    stringBuilder.append(s);
                }
                write.write(stringBuilder.toString().replaceAll("", ""));
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("text.txt"));
            doc.normalizeDocument();

            NodeList nodes = doc.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                Task11.printNode(" ", node);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void printNode(String tab, Node node) {

        if (node.getNodeType() == Node.ELEMENT_NODE) {
            tab += node.getNodeName();
            NamedNodeMap attribute = node.getAttributes();
            Node nameAttrib = attribute.getNamedItem("name");
            if (nameAttrib != null) {
                String a = nameAttrib.getNodeValue();
                tab+=" name = " + a;
            }
            else System.out.print("\n");
        } else if (node.getNodeType() == Node.TEXT_NODE)
            System.out.println(tab + "->" + node.getNodeValue());

        if (node.getChildNodes() != null) {
            NodeList nodes = node.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node1 = nodes.item(i);
                printNode(tab + "\t", node1);
            }
        }

    }
}