package com.ipartek.formacion.exceptions;

import com.ipartek.formacion.PerroException;
import com.ipartek.formacion.modelo.pojo.Perro;

/**
 * Se pueden capturar m�s de un tipo de excepciones Siempre la ultima en
 * capturar que sea Exception, que es la m�s generica
 * 
 * @author Curso
 *
 */
public class CapturarTiposExcepciones {

	public static void main(String[] args) {

		try {
			Perro perro = null; // no est� reservada en la memoria, no existe
			perro.setEdad(-2);
			perro.toString();
		} // dar�a NullPointerException porque es un dato que no existe

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se ha salido fuera del array");
		}

		catch (PerroException e) {
			System.out.println("PerroException null");
		} catch (NullPointerException e) {
			System.out.println("Excepcion null");
		} catch (Exception e) {
			System.out.println("Excepci�n generica, siempre la �ltima");
			e.printStackTrace();
		}
	}

}
