package com.ipartek.formacion;
/**
 * 
 * @author Manu
 * @see http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-iniciales-3.html
 *Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. 
 *A continuación muestra un mensaje indicando si A es par o impar. 
 *Utiliza el operador condicional ( <condicion> ? <true> : <false> ) dentro del println para resolverlo.
Si por ejemplo A = 14 la salida será
14 es par
Si fuese por ejemplo A = 15 la salida será:
15 es impar
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		
		final String NEJERCICIO = "Ejercicio 8: "; //valor constante, si se puede escribir en mayúsculas

		System.out.println(NEJERCICIO);
		
		int numero1 = 14;
		int numero2 = 15;
		
		System.out.println((numero1 % 2 == 0) ? "Es par" : "Es impar");

		String resultado = (numero2 % 2 == 0) ? "Es par" : "Es impar";
		
		System.out.printf("El numero %s es %s", numero2, resultado);
		//%s es para String, %i es para int, etc.
		
		float na = 4.1284882934f;
		float nb = (float)1284882934;
		float nc = 3;
		
		System.out.printf("Numero formateado con dos decimales %.2f", na);
	}

}
