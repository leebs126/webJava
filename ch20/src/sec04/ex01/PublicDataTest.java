package sec04.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PublicDataTest {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		URL url = new URL("http://openapi.seoul.go.kr:8088/46546a44706c65653939474d556957/xml/SebcHeritageInfoEng/1/5/");
		InputStream stream = url.openStream();
		char ch = 0;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(stream);
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("row");
		System.out.println("------------------------------------------------------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				System.out.println("문화재 키값: " + getTagValue("MAIN_KEY", eElement));
				System.out.println("문화재 일련번호: " + getTagValue("MNG_NO", eElement));
				System.out.println("문화재명칭: " + getTagValue("NAME_ENG", eElement));
				System.out.println("문화재 수량ㆍ규모 : " + getTagValue("QUANTITY_SCALE", eElement));
				System.out.println();
			}
		}

	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		if(nValue== null)
			return "1";
		return nValue.getNodeValue();
	}

}
