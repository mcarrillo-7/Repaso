import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.Ordenador;
import com.ipartek.formacion.Portatil;
import com.ipartek.formacion.Sobremesa;

public class PedirDatos {
	final static int ANYADIR_SOBREMESA = 1;
	final static int ANYADIR_PORTATIL = 2;
	final static int LISTA_PCS = 3;
	static Scanner sc = new Scanner(System.in);
	static int numero = 0;
	// Ordenador pc = null;
	static ArrayList<Sobremesa> listaSobremesa = new ArrayList<Sobremesa>();
	ArrayList<Portatil> listaPortatil = new ArrayList<Portatil>();

	public static void main(String[] args) {

		pintar();

		switch (numero) {
		case ANYADIR_SOBREMESA:
			addSobremesa();

			break;

		case ANYADIR_PORTATIL:
			addPortatil();
			break;

		case LISTA_PCS:
			listaEquipos();
			break;
		default:
			salir();
			break;
		}

	}

	private static void salir() {
		System.out.println("Hasta pronto!!");

	}

	private static void pintar() {
		System.out.println("Por favor, elija una de las siguientes opciones: ");
		System.out.println("---------------------------------------------------");
		System.out.println("1. Añadir ordenador de sobremesa");
		System.out.println("2. Añadir odenador portátil");
		System.out.println("3. Obtener lista");
	}

	private static void addPortatil() {
		
		try {
			System.out.println("Introduce la marca");
			String marca = sc.nextLine();
			System.out.println("Introduce el almacenamiento");
			float almacenamiento = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce la RAM");
			float ram = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce el procesador");
			float proces = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce las pulgadas de la pantalla");
			float pulgadasPantalla = Float.parseFloat(sc.nextLine());
			System.out.println("Estado de la batería");
			int bateria = Integer.parseInt(sc.nextLine());
			
			ArrayList<Portatil> listaPortatil = new ArrayList<Portatil>();
			listaPortatil.add(new Portatil(marca,  almacenamiento, ram, proces, pulgadasPantalla, bateria));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No has metido bien algún dato");
			addPortatil();
		}
		
		
		
	}

	private static void addSobremesa() {
		try {
			System.out.println("Introduce la marca");
			String marca = sc.nextLine();
			System.out.println("Introduce el almacenamiento");
			float almacenamiento = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce la RAM");
			float ram = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce el procesador");
			float proces = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce las pulgadas de la pantalla");
			float altura = Float.parseFloat(sc.nextLine());
			System.out.println("Estado de la batería");
			int peso = Integer.parseInt(sc.nextLine());
			
			ArrayList<Portatil> listaPortatil = new ArrayList<Portatil>();
			listaPortatil.add(new Portatil(marca,  almacenamiento, ram, proces, altura, peso));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No has metido bien algún dato");
			addSobremesa();
		}

	}

	private static void listaEquipos() {
		System.out.println("Listado de ordenadores:");
		System.out.printf(" %3s  %15s  %2s \n", "ID", "NOMBRE", "NUM. VECES VOLUNTARIO");
		
		Collections.sort((List<Sobremesa>) listaSobremesa);
		
		
	}

}
