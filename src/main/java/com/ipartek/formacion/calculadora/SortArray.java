package com.ipartek.formacion.calculadora;

import java.lang.reflect.Array;

public class SortArray {
	


	public static void main(String[] args) {
		int[] numeros = {8,6,9,7,1,3,2,0,5};
		int menor;
		
		for (int i = 0; i < 10; i++) {
			menor = numeros[0];
			
			if(numeros[i] < menor) {
				menor = numeros[i];
			} else {
				if(numeros[i] > menor) {
					menor = menor;
					
				}
			}
			
		}
		//System.out.println(numeros[]);

	}

}
