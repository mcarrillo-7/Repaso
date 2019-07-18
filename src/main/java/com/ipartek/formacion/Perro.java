package com.ipartek.formacion;

import com.ipartek.formacion.PerroException;

public class Perro {
	
	//stributos privados para encapsular

	 String chip; //packaged o friendly
	private String nombre;
	
	private String raza;
	
	private int edad;
	
	private boolean vacunado;
	
	//constructores. Damos unos valores por defecto
	
	public Perro() {
		super();
		this.nombre ="Sin nombre";
		this.raza = "Cruce";
		this.edad = 0;
		this.vacunado = false;
	}
	
	
	
	//sobrecarga de metodos.
	
	public Perro(String nombre) {
		//super();
		this();
		this.nombre = nombre;
	}





	//getters y setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}
	/**
	 * Setteamos la edad del perro, en el caso de ser menor que 0, ponemos un 0
	 * @param edad int  valor en a�os
	 * @throws Exception la edad tiene que ser mayor que 0 
	 */
	public void setEdad(int edad) throws Exception {
		
		if (edad < 0) {
			//this.edad = 0;
			throw new PerroException(PerroException.ERROR_EDAD);
		}
		else {
			this.edad = edad;

		}
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
	
	




	
	
	
}
