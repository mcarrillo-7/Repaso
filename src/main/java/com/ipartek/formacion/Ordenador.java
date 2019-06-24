package com.ipartek.formacion;

public class Ordenador {

	//variables
	String marca = "";
	float almacenamiento = 0.0f; //en GB
	float memoriaRAM = 0.0f; //en GB
	float procesador = 0.0f; //en GHz
	
	//constructor
	public Ordenador(String marca, float almacenamiento, float memoriaRAM, float procesador) {
		super();
		this.marca = marca;
		this.almacenamiento = almacenamiento;
		this.memoriaRAM = memoriaRAM;
		this.procesador = procesador;
	}
	
	//getters y setters
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(float almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public float getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(float memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	public float getProcesador() {
		return procesador;
	}
	public void setProcesador(float procesador) {
		this.procesador = procesador;
	}
	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", almacenamiento=" + almacenamiento + ", memoriaRAM=" + memoriaRAM
				+ ", procesador=" + procesador + "]";
	}
	
}
