package operadoresBasicos;

import java.util.Scanner;

public class OperacionesConCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre;
		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		int longitud = nombre.length();
		System.out.println("Tu nombre tiene " + longitud + " caracteres");
		
		String nombreMinuscula;
		nombreMinuscula = nombre.toLowerCase();
		System.out.println("Tu nombre en minúscula es " + nombreMinuscula);
		
		String nombreMayuscula;
		nombreMayuscula = nombre.toUpperCase();
		System.out.println("Tu nombre en mayúscula es " + nombreMayuscula);
	}

}
