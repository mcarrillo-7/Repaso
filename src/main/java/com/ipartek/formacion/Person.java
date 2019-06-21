package com.ipartek.formacion;

/**
 * 
 * Esto es JavaDoc, comentarios para documentar tu codigo fuente
 *
 */

public class Person implements IAmigable{
	
	//Atributos privados para encapsular
	
	protected int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	private String nombre;
	
	private int edad;
	
	private float altura;   //1.70 m
	
	private float peso;
	
	private String color_ojos;
	
	private char sexo;  //"h" hombre, "m" mujer, "i" indefinido
	
	//hacemos un constructor donde la persona por defecto va a tener nombre "Anonimo", la edad 18 a�os, altura 0, peso 0
	//ojos marrones y sexo i de indefinido. sobrecargar el constructor para poder crear una persona indicando el nombre, la edad y el sexo
	public String saludar() {
		
		return "Hola me llamo " + getNombre() + ".";
		
	}


	public Person() {
		super();//llama al padre java.lang.Object
		this.id = -1;
		this.nombre = "Anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.color_ojos = "marrones";
		this.sexo = 'i';
	}

	
public Person(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	//constructor sobrecargado con todos los atributos
	public Person(String nombre) {
		this();
		this.nombre = nombre;

	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		/*if(nombre == null) {
			
		} else {
			
			this.nombre = nombre;
		}*/
		//En el comentario indicamos que no ponga nada si no se ha introducido un nombre
		this.nombre = nombre;
	}





	@Override
	public String toString() {
		return "Person [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso
				+ ", color_ojos=" + color_ojos + ", sexo=" + sexo + "]";
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
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


	public String getColor_ojos() {
		return color_ojos;
	}


	public void setColor_ojos(String color_ojos) {
		this.color_ojos = color_ojos;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String mandarAlaMierda() {
		// TODO Auto-generated method stub
		return "Hasta nunca pringao";
	}


	@Override
	public String despedir() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
