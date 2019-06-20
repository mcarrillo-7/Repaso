package com.ipartek.formacion;

import java.util.Scanner;

public class ExceptionNumeros {

	public static void main(String[] args) {

		boolean repetir = false;
		int n1 = 0;
		int n2 = 0;
		Scanner sn1 = new Scanner(System.in);

		
		Scanner sn2 = new Scanner(System.in);

		

		
		//n2 = Integer.parseInt(numero2);

		do { //repeticion de 1 a N

			System.out.println("Introduce el primer número");
			System.out.println("Introduce el segundo número");
			
			try {
				n1 = Integer.parseInt(sn1.nextLine());
				n2 = Integer.parseInt(sn2.nextLine());
				repetir = false;
			} catch (Exception e) {
				repetir = true;
			}

		} while (repetir);
		
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));

	}

}
