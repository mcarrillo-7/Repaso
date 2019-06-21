package com.ipartek.formacion;

import java.util.Scanner;

public class EjemploExcepciones {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor escribe un numero del 0 al 9");

		// intenta hacer esto
		try {
			String sNumero = sc.nextLine(); // usar siempre esto mejor que nextInt, nextChar...
			int numero = Integer.parseInt(sNumero); // lanza una excepcion si en vez de
													// escribir un numero escribimos una letra

			System.out.println("Su numero es " + sNumero);

		}
		// y si hay algun error lanza un mensaje por pantalla
		catch (Exception exc) {
			exc.printStackTrace(); // esta linea nos muestra el fallo (NumberFormatException)
			System.out.println("Mensaje Excepcion " + exc.getMessage());
			System.out.println("Te dije un número, que si no falla, atontao!");
		} finally {
			sc.close();
		}

		System.out.println("End(game)");

	}

}
