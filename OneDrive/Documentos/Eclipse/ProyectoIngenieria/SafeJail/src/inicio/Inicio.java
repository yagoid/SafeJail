package inicio;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----------------------------------------------------------------\n\n"
				+ "*************       �BIENVENIDO A SAFEJAIL!       *************"
				+ "\n\n----------------------------------------------------------------\n");
		
		//Preguntamos al usuario que quiere hacer y procesamos su respuesta
		System.out.println("�Qu� desea hacer?\n");
		System.out.println("I - Iniciar sesi�n\n" + "R - Registrarse");
		
		boolean validado = false;
		
		//Hasta que no se introduzcan bien la respuesta, se preguntar� de nuevo
		while (!validado) {
						
			String respuesta = sc.nextLine();
			respuesta = respuesta.toUpperCase();
		
			//Iniciar sesi�n
			if (respuesta.equals("I")) {
				validado = true;
				System.out.println("oka");
				
				
				
			//Registrarse
			} else if (respuesta.equals("R")) {
				validado = true;
				System.out.println("va");
				
				
				
			} else {
				System.out.println("\nRespuesta no aceptada. Pruebe de nuevo.");
				
			}
		}
		

	}
}
