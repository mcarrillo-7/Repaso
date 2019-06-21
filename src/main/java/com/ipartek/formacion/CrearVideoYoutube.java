package com.ipartek.formacion;

import java.util.Scanner;

public class CrearVideoYoutube {
	
	public static void main(String[] args) {
		boolean repetir = true;
		Youtube video = null;
		System.out.println("---------CREAR VIDEO DE YOUTUBE---------");
		System.out.println("----------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Titulo del vídeo, recuerde la longitud [2,250]");
			String titulo = scan.nextLine();
			System.out.println("Codigo del vídeo");
			String codigo = scan.nextLine();
			
			try {
				Youtube video1 = new Youtube(titulo, codigo);
				System.out.println("Video creado correctamente");
				System.out.println(video1);
			} catch (Exception e) {
				System.out.println("La longitud no es la adecuada");
			}
		} while (repetir);


		
		
	}

}
