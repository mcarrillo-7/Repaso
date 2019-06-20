package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.modelo.ICrudAble;

public class Aula extends Person implements ICrudAble{

	static Person pojo;
	static Scanner sc;
	static int numeroTeclado;
	static ArrayList<Person> listaPersonas = new ArrayList<Person>();
	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCAR_VOLUNTARIO = 4;
	static final int OPCION_SALIR = 5;
	static boolean bool = true;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		do {
			System.out.println("1. Listar alumno + ranking");
			System.out.println("2. Crear alumno");
			System.out.println("3. Eliminar alumno");
			System.out.println("4. Buscar voluntario");
			System.out.println("5. Salir");
			
			try {
				numeroTeclado = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Opcion no disponible");
			}

			int numeroTeclado = 0;
			numeroTeclado = Integer.parseInt(sc.nextLine());
			switch (numeroTeclado) {
			case OPCION_LISTAR:
				listar();

				break;

			case OPCION_CREAR:
				crearAlumno();
				break;

			case OPCION_ELIMINAR:
				eliminarAlumno();

				break;

			case OPCION_BUSCAR_VOLUNTARIO:
				buscarVoluntario();

				break;
			}
		} while(OPCION_SALIR == 5);
		
		

	}

	public static void crearAlumno() {
		System.out.println("Nombre");
		String name = sc.nextLine();
		listaPersonas.add(new Person(name));
		
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre());
			
		}

	}

	public static void eliminarAlumno() {
		System.out.println("Escribe el nombre de la persona que quieres borrar");
		String name1 = sc.nextLine();
		listaPersonas.remove(name1);

	}

	public static void listar() {
		int numero = (int) (Math.random() * listaPersonas.size());

		/*for (int i = 0; i < listaPersonas.size(); i++) {

			 System.out.println(listaPersonas.get(numero).getNombre());

			if (numero == i) {// Si el numero es igual que el numero del array
				int cont = 0;
				cont++;
				int rank = numero + cont;

				//System.out.println(i + " " + listaPersonas.get(numero) + rank + " veces elegido aleatoriamente.)");

			} else {

				//System.out.println("---" + listaPersonas.get(numero));
			}
		}*/
		for (Person alumno : listaPersonas) {
			
			
		}

	}

	public static void buscarVoluntario() {

		int numero = (int) (Math.random() * listaPersonas.size());
		for (int i = 0; i < listaPersonas.size(); i++) {

			// System.out.println(listaPersonas.get(numero).getNombre());

			if (numero == i) {// Si el numero es igual que el numero del array
				int cont = 0;
				cont++;
				int rank = numero + cont;

				System.out.println(i + " " + listaPersonas.get(numero) + rank + " veces elegido aleatoriamente.)");

			} else {

				System.out.println("---" + listaPersonas.get(numero));
			}
		}
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Person pojo) {
		listaPersonas.add(pojo);
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		boolean result =false;
		for (Person person : listaPersonas) {
			if(person.getId() == pojo.getId()) {
				result = true;
				listaPersonas.remove(pojo.getId());
				break;
			}
		}
		return result;
	}

	@Override
	public boolean update(Person pojo) {
		boolean encontrado = false;
		for (Person p : listaPersonas) {
			if(p.getId() == pojo.getId()) {
				encontrado = true;
				listaPersonas.remove(p.getId());
				listaPersonas.add(pojo);
				break;
			}
			
		}
		return false;
	}

}

//declarar array con nombre alumnos

/*
 * String[] Alumnos = { "Mounir", "Andoni", "Asier", "JonC", "Arkaitz", "Aritz",
 * "Manuel", "Eduardo", "Eder I", "Eder S", "Gaizka", "Borja", "Verónica",
 * "Jon A", "José Luis"};
 * 
 * // generar numero aleatorio
 * 
 * int numero = (int) (Math.random() * Alumnos.length);
 * 
 * System.out.println("Voluntario " + Alumnos[numero]);
 * 
 * // mostrar voluntario para leer
 * 
 * for (int i = 0; i < Alumnos.length; i++) {
 * 
 * 
 * 
 * } // end for
 */