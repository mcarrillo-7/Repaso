package com.ipartek.formacion;

import java.util.Scanner;

/**
 * 
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 * 
 *
 */
public class VariablesPrimitivasYWrappers {

	public static void main(String[] args) {
		// declarar todos los posibles tipos de variables primitivas

		// numeros enteros
		byte b = 2;
		short s = 4;
		int i = 0;
		long l = 8;

		// numeros reales
		float f = 2.43f;
		double d = 6.11;

		char c = 'a'; // SIEMPRE comillas simples

		boolean b1 = true; // or false

		// Wrappers puede acceder a metodos y atributos

		int nparseado = Integer.parseInt("3");

		System.out.printf("El rango de un int %d %d", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// indicar si el caracter introducido por pantalla es mayúsculas, minúsculas,
		// letra o número

		System.out.println("Por favor, introduce un caracter");

		Scanner sc = new Scanner(System.in); // para poder sacar lo que escribimos

		char letra = sc.next().charAt(0); // coge la primera posicion de lo que se escribe

		System.out.println("Has escrito " + letra);
		
		System.out.println(Character.isUpperCase(letra) ? "Es mayuscula" : "No es mayuscula");
		System.out.println(Character.isLowerCase(letra) ? "Es minuscula" : "No es minuscula");
		System.out.println(Character.isDigit(letra) ? "Es un numero" : "No es un numero");
		System.out.println(Character.isLetter(letra) ? "Es letraa" : "No es letra");
		System.out.println(Character.isLetterOrDigit(letra) ? "Es letra o numero" : "Es caracter especial");
		System.out.println(Character.isWhitespace(letra) ? "" : "Espacio en blanco");

		if (Character.isUpperCase(letra)) {
			System.out.println("Mayúscula");

		} else if (Character.isLowerCase(letra)) {
			
			System.out.println("Minúscula");

		}

		else if (Character.isDigit(letra)) {

			System.out.println("Es un numero");

		} else if (Character.isLetter(letra)) {

			System.out.println("Es una letra");
		}

		sc.close();
		/*
		 * System.out.printf("La primera posición de un caracter %c",
		 * Character.isUpperCase(letra));
		 * System.out.printf("La primera posición de un caracter %c",
		 * Character.isLowerCase(letra));
		 * System.out.printf("La primera posición de un caracter %c",
		 * Character.isDigit(letra));
		 * System.out.printf("La primera posición de un caracter %c",
		 * Character.isLetter(letra));
		 * System.out.printf("La primera posición de un caracter %c",
		 * Character.isWhitespace(letra));
		 */
	}
}
