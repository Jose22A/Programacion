/*
 * Descripción: Manejo de cadenas de caracteres
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.print("Introduce una cadena de texto: ");
		cadena = teclado.nextLine();
		
		int numeroAs = 0, numeroEs = 0, numeroIs = 0, numeroOs = 0, numeroUs = 0;
		for (int posicion = 0; posicion < cadena.length(); posicion++) {
			if ((cadena.charAt(posicion) == 'A')||(cadena.charAt(posicion) == 'a')) {
				numeroAs++;
			} else if ((cadena.charAt(posicion) == 'E')||(cadena.charAt(posicion) == 'e')) {
				numeroEs++;
			} else if ((cadena.charAt(posicion) == 'I')||(cadena.charAt(posicion) == 'i')) {
				numeroIs++;
			} else if ((cadena.charAt(posicion) == 'O')||(cadena.charAt(posicion) == 'o')) {
				numeroOs++;
			} else if ((cadena.charAt(posicion) == 'U')||(cadena.charAt(posicion) == 'u')) {
				numeroUs++;
			}
		}
		
		System.out.println("Nº de A's: " + numeroAs);
		System.out.println("Nº de E's: " + numeroEs);
		System.out.println("Nº de I's: " + numeroIs);
		System.out.println("Nº de O's: " + numeroOs);
		System.out.println("Nº de U's: " + numeroUs);
	}

}
