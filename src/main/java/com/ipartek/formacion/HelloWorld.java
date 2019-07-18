package com.ipartek.formacion;

import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String nombre = "Ander";
		
		System.out.println("Hello " + nombre);
		
		/*Person p1 = new Person(); //Instanciar un objeto, crear un objeto tipo Person
		p1.setNombre("Manolo");*/
		
		//System.out.println(p1.saludar());
		
		Perro perro1 = new Perro();
		//perro1.setNombre("Leia");
		perro1.setEdad(-3);
		//perro1.setRaza("bichon maltes");
		perro1.setVacunado(true);
		System.out.println(perro1.toString());
		
		
		PerroPresa buba = new PerroPresa();
		buba.setNombre("buba");
		buba.atacar();
	}

}
