package com.ipartek.formacion;

public class Sobremesa extends Ordenador implements Comparable{

	float altura = 0.0f;
	float peso = 0.0f;

	public Sobremesa(String marca, float almacenamiento, float memoriaRAM, float procesador, float altura, float peso) {
		super(marca,almacenamiento, memoriaRAM, procesador);
		this.altura = altura;
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Sobremesa [altura=" + altura + ", peso=" + peso + "]";
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

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return (int) this.procesador;
	}
	

}
