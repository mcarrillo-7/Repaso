package com.ipartek.formacion.calculadora;

import com.ipartek.formacion.Perro;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// metodos de instancia u objeto
		Perro p = new Perro();
		p.toString();
		
		
		// metodos estaticos o de clase, obligatorio que sean 'static'
		
		Math.random();
		
		int resultado = Calculadora.sumar(2,3);
		System.out.println( "2 + 3 = " + resultado );

	}
	}


