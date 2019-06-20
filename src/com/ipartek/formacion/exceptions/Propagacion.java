package com.ipartek.formacion.exceptions;

import com.ipartek.formacion.Perro;

public class Propagacion {

	public static void main(String[] args) throws Exception {
		System.out.println("Start Main");
		metodoA();
		System.out.println("End Main");

	}
	private static void metodoA() throws Exception {
		System.out.println("Start metodo A");
		//metodoB();
		Perro p = new Perro();
		p.setEdad(-2);
		System.out.println(p);
		
		System.out.println("End metodo A");
	}
	
	private static void metodoB() {
		System.out.println("Start metodo B");
		System.out.println("End metodo B");
	}

}
