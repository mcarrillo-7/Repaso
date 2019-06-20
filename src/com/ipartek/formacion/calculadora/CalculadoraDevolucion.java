package com.ipartek.formacion.calculadora;


import java.util.Scanner;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y monedas	
	 * @param importe float costo del articulo a comprar
	 * @param entregado float dinero entrega para comprar
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe < 0 o entregado < 0
	 */
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	float importe = 0;
	
	do {
		try {
			System.out.println("Introduce el importe");
			importe = scan.nextFloat();
			
		} catch (Exception e) {
			System.out.println("Dato erroneo");
			scan.nextLine();
		}
	} while (importe <= 0);
	
	devolver(importe);
}	
	

	
	private static void devolver(float importe) {
		
		

		float[] cifras = {500 ,200 ,100 ,50 ,20 ,10 ,5 ,2 ,1 ,0.5f ,0.2f ,0.1f, 0.05f, 0.02f, 0.01f};
		
		float[] devuelto = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < cifras.length; i++) {
			
			if(importe >= cifras[i]) {
				
				devuelto[i] = (float) Math.floor(importe/cifras[i]);
				
				importe = importe - (devuelto[i]*cifras[i]);
				
			}
			
		}
		
		for (int i = 0; i < cifras.length; i++) {
			
			if(devuelto[i] > 0) {
				if (cifras[i] > 2) {
					System.out.println(devuelto[i] + " billetes de "  + cifras[i]);
					
					
				} else {
					System.out.println(devuelto[i] + " monedas de " + cifras[i]);
				}
			}
			
		}
		
	}



	public static int[] vueltas(float importe, float entregado) throws Exception {

	
		
		
		
		if(entregado < importe) {
			throw new Exception("Falta dinero");
			
		}
	   if (entregado < 0 || importe < 0) {
		   
			throw new Exception("Tiene que ser mayor que 0");
		} 

		
		// TODO vuestro marron, para que penseis
		int[] cambios = new int[BILLETES_MONEDAS.length];
		float resto = entregado - importe;
		
		if(resto > 0) {
			for (int i = 0; i < cambios.length; i++) {
				
				cambios[i] = (int) (resto / BILLETES_MONEDAS[i]);
				resto = resto % BILLETES_MONEDAS[i];
				//redondear a dos decimales porque los float pierden unos digitos
				resto = Math.round(resto * 100.0f) /100.0f;
			}
		}
		
		return cambios;
	}
}
