package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AppVoluntario {

	final static int  OPCION_LISTAR     = 1;
	final static int  OPCION_CREAR      = 2;
	final static int  OPCION_BORRAR     = 3;
	final static int  OPCION_VOLUNTARIO = 4;
	final static int  OPCION_SALIR      = 0;
	
	static int opcionSeleccionada;
	static Scanner sc;
	static ArrayList<Alumno> lista;
	static DAOAlumnoArrayList dao;
	
	
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		dao = new DAOAlumnoArrayList();
		lista = new ArrayList<Alumno>();
		//dao = DAOAlumnoArrayList.getInstance();
		lista.add(new Alumno(1, "Ander"));
		lista.add(new Alumno(2, "Mounir"));
		lista.add(new Alumno(3, "Andoni"));
		lista.add(new Alumno(4, "Asier"));
		lista.add(new Alumno(5, "Jon C"));
		lista.add(new Alumno(6, "Arkaitz"));
		lista.add(new Alumno(7, "Manuel"));
		lista.add(new Alumno(8, "Eder I"));
		lista.add(new Alumno(9, "Eder S"));
		lista.add(new Alumno(10, "Gaizka"));
		lista.add(new Alumno(11, "Borja"));
		lista.add(new Alumno(12, "Verónica"));
		lista.add(new Alumno(13, "Jon A"));
		lista.add(new Alumno(14, "Jose Luis"));
		
		// dao.getById(id)
		
		// dao.delete(id)
		
		
		do {
		
			pintarMenuYpedirOpcion();
			
			switch (opcionSeleccionada) {
			case OPCION_LISTAR:
				listar();
				break;
				
			case OPCION_BORRAR:
				borrar();
				break;
	
			case OPCION_CREAR:
				crear();
				break;

				
			default:
				voluntario();
				break;
			}
			
		}while(opcionSeleccionada != OPCION_SALIR);
		
		System.out.println("Agur Venur");
		
		
		sc.close();
		

	}



	private static void crear() {
		
		try {
		
			//pedir datos por consola
			System.out.println("Dime el NOMBRE:");
			String nombre = sc.nextLine();
			
			System.out.println("Dime el ID:");
			int id = Integer.parseInt(sc.nextLine());
			
			// creamos nuevo alumno
			Alumno nuevoAlumno = new Alumno(id, nombre);
			
			// persistir a traves del dao
			if ( dao.insert(nuevoAlumno) ) {
				
				System.out.println("Alumno creado con Exito !!!!!!!!!!!! ");
				
			}else {
				
				System.out.println("*** ERROR al insertar **** ");
				
			}
		}catch (Exception e) {
			System.out.println("*** DATOS INCORRECTOS, por favor empieza de nuevo *** ");
			crear();
		}	
		
	}


	private static void voluntario() {
		int numero = (int) (Math.random() * lista.size());

		System.out.println("El Volunatior es " + lista.get(numero).getNombre());

		for (int i = 0; i < lista.size(); i++) {

			if (numero == i) {

				System.out.println("*** " + lista.get(i)); // toString()

			} else {

				System.out.println(i + " " + lista.get(i).getNombre());

			}

		}
		
		 
	}

	private static void borrar() {
		System.out.println("Borrar Alumno");
		System.out.println("Dime el nombre");
		String nombre = sc.nextLine();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i);
			String eliminado = lista.get(i).getNombre();
			if(nombre.equals(eliminado)) {
				lista.remove(i);
				
			}
		}
		for (Alumno alumno : lista ) {
			System.out.println( alumno.getNumVecesLeer() + " " + alumno.getNombre() );
		}
		

		
	}

	private static void listar() {
		System.out.println("Listado de Alumnos");
		System.out.println("-----------------------------");
		
		//TODO ordenar
		
		for (Alumno alumno : lista ) {
			System.out.println( alumno.getId() + " " + alumno.getNombre() );
		}
		
		
	}

	private static void pintarMenuYpedirOpcion() {
		
		System.out.println("-------------------------------");
		System.out.println("1 Listar");
		System.out.println("2 Crear");
		System.out.println("3 Eliminar");
		System.out.println("4 Voluntario");		
		System.out.println("-------------------------------");
		System.out.println(" 0 para salir");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Dime tu opcion.....");
		
		try {
		
			opcionSeleccionada = Integer.parseInt(sc.nextLine());
			
		}catch (Exception e) {
			System.out.println("*** opcion no posible **** ");
			
			pintarMenuYpedirOpcion();
			
		}	
		
		
		
	}

}