package com.ipartek.formacion;

public abstract class ObjetoGrafico {
	//atributos
	
	//constructores
	
	public void mover(int x, int y) {
		System.out.println("Movemos el objeto");
	}
	
	
	public abstract void dibujar(); //prototipo
	public abstract void circulo();


	public void dibujar(String color) {
		// TODO Auto-generated method stub
		
	}

}
