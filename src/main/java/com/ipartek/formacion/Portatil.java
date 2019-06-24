package com.ipartek.formacion;

public class Portatil extends Ordenador implements Comparable{
	
	float tamanoPantalla = 0.0f; //en pulgadas
	int estadoBatería = 0; //porcentaje de la batería
	

	public Portatil(String marca, float almacenamiento, float memoriaRAM, float procesador, float tamanoPantalla,
			int estadoBatería) {
		super(marca, almacenamiento, memoriaRAM, procesador);
		this.tamanoPantalla = tamanoPantalla;
		this.estadoBatería = estadoBatería;
	}


	public float getTamanoPantalla() {
		return tamanoPantalla;
	}


	public void setTamanoPantalla(float tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}


	public int getEstadoBatería() {
		return estadoBatería;
	}


	public void setEstadoBatería(int estadoBatería) {
		this.estadoBatería = estadoBatería;
	}


	@Override
	public String toString() {
		return "Portatil [tamañoPantalla=" + tamanoPantalla + ", estadoBatería=" + estadoBatería + "]";
	}


	@Override
	public int getValue() {
		
		return  (int) this.procesador;
	}


	@Override
	public int compareTo(Ordenador o) {
		int result = 0;
		if(this.procesador < o.procesador) {
			result = -1;
		} else if(this.procesador > o.procesador) {
			result = 1;
		}
	return result;
	}




}
