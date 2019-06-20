package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HashMapTest {



	@Test
	public void test() {


		HashMap<String, String> paises = new HashMap<String, String>();
		
		paises.put("BK", "Barakaldo");
		paises.put("EU", "EEUU");
		paises.put("KO", "Korea");
		
		assertEquals(3, paises.size());
		
		assertEquals("Barakaldo", paises.get("bk"));
		
		assertNull(paises.get("no-existe-key"));
		paises.put("BK", "Barakaldo");
		
		int cont  = 0;
		Iterator<String> iterc= paises.values().iterator(); //@see keySet()
		while (iterc.hasNext()) {
			String pais = iterc.next();
			if("Barakaldo".equals(pais)) {
				cont++;
			}
			
		}
		assertEquals(2, cont);
		
	
	}
}
