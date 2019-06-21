package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YoutubeTest {
	final static String NOMBRE_VIDEO = "hola";
	final static String CODIGO_VIDEO = "12345678901";
	Youtube youtuber;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		youtuber = new Youtube(NOMBRE_VIDEO, CODIGO_VIDEO);
	}

	@After
	public void tearDown() throws Exception {
		youtuber = null;
	}

	@Test
	public void testYoutube() {
		assertEquals(youtuber.getTitulo(), NOMBRE_VIDEO);
		assertEquals(youtuber.getCodigo(), CODIGO_VIDEO);
		assertEquals(0, youtuber.getReproducciones());
		
		
		try {
			youtuber = new Youtube(null, null);
			fail("Constructo con nulls");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		}
		
		try {
			youtuber = new Youtube(NOMBRE_VIDEO, "12");
			fail("Codigo 11 caracteres");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			youtuber = new Youtube("", CODIGO_VIDEO);
			fail("titulo incorrecto");
		} catch (Exception e) {
			assertTrue(true);
		}
		

	}

	@Test
	public void testGetTitulo() throws Exception {
		
		assertEquals(youtuber.getTitulo(), "hola");
	}

	@Test
	public void testSetTitulo() throws Exception {
		
		
		youtuber.setTitulo("Hazard");
		assertEquals("Hazard", youtuber.getTitulo());

	}

	@Test
	public void testGetCodigo() throws Exception{
		
		assertEquals("11223344556", youtuber.getCodigo());
	}

	@Test
	public void testSetCodigo() throws Exception {
		try {
			youtuber.setCodigo("09876543214");
			assertEquals("09876543214", youtuber.getCodigo());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//youtuber.setCodigo("09876543213");
		//assertEquals("09876543213", youtuber.getCodigo());
		
	}

	@Test
	public void testGetReproducciones() {
		
		assertEquals(3, youtuber.getReproducciones());
	}

	@Test
	public void testSetReproducciones() {
		youtuber.setReproducciones(-2);
		assertEquals(-2, youtuber.getReproducciones());
	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}


}
