package com.ipartek.formacion.xml;


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


/**
 * leer xml con listado de perros, guardar en arraylist y mostrar por pantalla
 * @author Curso
 *
 */
public class LeerPerrosFromXML {
	
	
	
	public static void main(String[] args)  {
		//crear builder

	//parsear documento perros.xml
			
	//recorrer document y rellenar arraylist
	//mostrar por pantalla
		
		 try {
	         File inputFile = new File("C:\\\\1713\\\\eclipse-workspace\\\\HolaClase\\\\src\\\\main\\\\java\\\\com\\\\ipartek\\\\formacion\\\\xml\\\\perros.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("perros");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Nombre del perro : " 
	                  + eElement.getAttribute("nombre"));
	               System.out.println("Raza del perro : " 
	                  + eElement
	                  .getElementsByTagName("raza")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Edad del perro: " 
	                  + eElement
	                  .getElementsByTagName("edad")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Vacunado: " 
	                  + eElement
	                  .getElementsByTagName("vacunado")
	                  .item(0)
	                  .getTextContent());
	              
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

}
}	
