/*
 * Descripción: Manejo de cadenas de caracteres
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellido1, apellido2;
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduce tu primer apellido: ");
		apellido1 = teclado.nextLine();
		System.out.print("Introduce tu segundo apellido: ");
		apellido2 = teclado.nextLine();
		
		String cadenaNombre, cadenaApellido1, cadenaApellido2, codigo;
		cadenaNombre = nombre.substring(0, 3).toUpperCase();
		cadenaApellido1 = apellido1.substring(0, 3).toUpperCase();
		cadenaApellido2 = apellido2.substring(0, 3).toUpperCase();
		codigo = cadenaNombre.concat(cadenaApellido1).concat(cadenaApellido2);
		
		System.out.println("Código de usuario: " + codigo);
	}

}
