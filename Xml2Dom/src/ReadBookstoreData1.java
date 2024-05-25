/* Arbeitsauftrag:  Lesen Sie den Titel des Buches "Java ist auch eine Insel" aus der Datei  
 *                  "buchhandlung.xml" und geben Sie sie auf dem Bildschirm aus.
 *                  Ausgabe soll wie folgt aussehen:
 *                     titel:  Java ist auch eine Insel                  
 */

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


public class ReadBookstoreData1 {

	public static void main(String[] args) {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//why newInstance, what is the difference with newDefaultInstance?
		try {
			DocumentBuilder dbuilder = factory.newDocumentBuilder();
			Document doc = dbuilder.parse("buchhandlung.xml");
			
			NodeList titelList = doc.getElementsByTagName("titel");
			Node titelNode = titelList.item(0);
			
			System.out.println(titelNode.getNodeName()+ ":" + titelNode.getTextContent());
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}

	}


