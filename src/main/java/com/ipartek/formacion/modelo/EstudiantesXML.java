package com.ipartek.formacion.modelo;
/**
 * ejeercicio pra parsear y trabajr con xml
 * @author Curso
 *
 */
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
	
public class EstudiantesXML {

public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
			DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			//similar a String pero preparado para trabajar con String grandes o ficheros grandes
			StringBuilder xmlStringBuilder = new StringBuilder();
			//le añadimos texto que seria la version de xml
			xmlStringBuilder.append("<?xml version=\"1.0\"?> <class> </class>");
			ByteArrayInputStream input = new ByteArrayInputStream(
			   xmlStringBuilder.toString().getBytes("UTF-8"));
			Document doc = builder.parse(input);
			
			
			Element el = doc.getDocumentElement();
			NodeList nodel = el.getChildNodes();
			String nombre = nodel.item(0).getTextContent();
			String edad = nodel.item(1).getTextContent();
			String contenidoRextoCompleto = el.getTextContent();
			el.getTextContent();
			System.out.println("A ver que sacamos del perro" + nombre);
}
}
