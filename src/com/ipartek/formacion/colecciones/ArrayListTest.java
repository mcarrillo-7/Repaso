package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {

		// String[] paises = new String[3];

		ArrayList<String> paises = new ArrayList<String>();
		assertTrue(paises.isEmpty()); //testeamos qe la lsta de paises esta vacia
		
		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Korea la Buena");
		assertFalse(paises.isEmpty());
		
		assertEquals(3, paises.size());
		
		//Insertar Kuala Lumpur  entre Barakaldo y EEUU
		paises.add(1, "Kuala Lumpur");
		assertEquals("Kuala Lumpur", paises.get(1));
		
		//Insertar Barakaldo de nuevo para comprobar que se puede repetir
		paises.add("Barakaldo");
		int count = 0;
		
		Iterator<String> it = paises.iterator(); //devuelve un string de tipo iterator  y lo convierte en el array
		while (it.hasNext()) {
			String pais = it.next();
			if("Barakaldo".equals(pais)) {
				count++;
			}
				
			
		}
		assertEquals(2,  count);
		
		//Probar a eliminar Korea La buena
		assertTrue(paises.remove("Korea La Buena"));
		assertFalse(paises.remove("Korea La Buena"));
		
		
		
		//Probar a eliminar todo
		paises.clear();
		assertTrue(paises.isEmpty());
		
		//usar contains para saber si existe Barakaldo y Korea la buena
		assertTrue(paises.contains("Barakaldo"));
		assertFalse(paises.contains("Korea La Buena"));
		
		//TODO mirar como ordenar alfabeticamente
				paises.add("Barakaldo");
				paises.add("EEUU");
				paises.add("Korea la Buena");
				Collections.sort(paises);
				
				assertEquals("Barakaldo", paises.get(0));
				assertEquals("EEUU", paises.get(1));
				assertEquals("Korea la buena", paises.get(2));
		

	}

}
