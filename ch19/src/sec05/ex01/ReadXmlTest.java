package sec05.ex01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXmlTest {

	public static void main(String[] args)  throws Exception {
			File fXmlFile = new File("src\\sec05\\ex01\\company.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("emp");
			System.out.println("-----------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("firstName: " + getTagValue("firstname", eElement));
					System.out.println("lastName: " + getTagValue("lastname", eElement));
					System.out.println("nickName: " + getTagValue("nickname", eElement));
					System.out.println("salary: " + getTagValue("salary", eElement));
					System.out.println();
				}
			}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	}

}
